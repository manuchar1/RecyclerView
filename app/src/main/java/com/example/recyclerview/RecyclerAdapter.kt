package com.example.recyclerview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_list_item.view.*


class RecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<Comics> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is BlogViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount() = items.size

    fun submitList(blogList: List<Comics>){
        items = blogList
    }

    class BlogViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val comicsImage: ImageView = itemView.blog_image
        private val comicsTitle: TextView = itemView.blog_title
        private val blog_author: TextView = itemView.blog_author

        fun bind(blogPost: Comics){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(blogPost.image)
                .into(comicsImage)
            comicsTitle.text = blogPost.quotes
            blog_author.text = blogPost.name

        }

    }

}
