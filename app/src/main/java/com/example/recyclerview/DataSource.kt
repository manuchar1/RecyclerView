package com.example.recyclerview


class DataSource{

    companion object{

        fun createDataSet(): ArrayList<Comics>{
            val list = ArrayList<Comics>()
            list.add(
                Comics(
                    "With great power comes great responsibility",
                    "https://i.pinimg.com/originals/56/15/6f/56156f152ad8615ff01c9419718f8930.jpg",
                    "Spider-Man"
                )
            )
            list.add(
                Comics(
                    "Why do we fall? So that we can learn to pick ourselves up",
                    "https://i.pinimg.com/originals/4d/ea/b8/4deab81c1e593dc26f08c4a830fa840a.jpg",
                    "Batman"
                )
            )

            list.add(
                Comics(
                    "If you are good at something, never do it for free",
                    "https://i.redd.it/z43fq53wzs751.jpg",
                    "Joker"
                )
            )
            list.add(
                Comics(
                    "There is a superhero in all of us. We just need the courage to put on the cape",
                    "https://pro2-bar-s3-cdn-cf6.myportfolio.com/524eb4979266f824c52be17802c95eef/79c26d76-c3cf-4080-8800-280ed26d5bfc_rw_1920.jpg?h=2633b6c2abec9c735e11ad7cab585195",
                    "Superhero"
                )
            )
            list.add(
                Comics(
                    "Heroes are made by the path they choose, not the powers they are graced with",
                    "https://cdnb.artstation.com/p/assets/images/images/015/409/605/large/blake-johnson-ironman-portrait.jpg?1548221017",
                    "Iron Man"
                )
            )
            list.add(
                Comics(
                    "I will fight for those who cannot fight for themselves",
                    "https://cellularnews.com/wp-content/uploads/2020/05/14-justice-league-wonder-woman-portrait-325x485.jpg",
                    "Wonder Woman"
                )
            )
            list.add(
                Comics(
                    "But everybody’s story begins ‘once upon a time’, and it’s up to us to cherish the time we’re given to ensure we live happily ever after",
                    "https://cdn11.bigcommerce.com/s-nwrju1zxln/images/stencil/1280x1280/products/374/654/Scarlet_Witch_Flame__84667.1570158238.jpg?c=1",
                    "Scarlet Witch"
                )
            )
            list.add(
                Comics(
                    "If you cage the beast, the beast will get angry",
                    "https://cafans.b-cdn.net/images/Category_90395/subcat_131865/Wolverine%20as%20Hugh%20Jackman%20fred.ian%20portrait.jpg",
                    "Wolverine"
                )
            )
            list.add(
                Comics(
                    "Intelligence is a privilege, and it needs to be used for the greater good of people",
                    "https://cdn.vox-cdn.com/thumbor/pkBJ5GTCdnFE93dPh6UK3TQ2GaY=/0x0:1600x900/1200x800/filters:focal(454x0:710x256)/cdn.vox-cdn.com/uploads/chorus_image/image/68479622/doc_ock.0.jpg",
                    "Dr. Octopus"
                )
            )
            return list
        }
    }
}