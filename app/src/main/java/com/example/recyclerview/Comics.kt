package com.example.recyclerview

data class Comics(

    var quotes: String,
    var image: String,
    var name: String

) {

    override fun toString(): String {
        return "BlogPost(title='$quotes', image='$image', username='$name')"
    }


}
























