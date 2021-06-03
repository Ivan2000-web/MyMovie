package com.ivan.mymovie.ui.data.vo


import com.google.gson.annotations.SerializedName

data class MovieDetails(



    var biography: String,
    var birthday: String,
    var deathday:String,
    var id:Int,
    var popularity:Double,
    var homepage: String,
    var name: String,
    var place_of_birth: String,
    @SerializedName("profile_path")
    var profile_path: String

)


    //val budget: Int,
    //val id: Int,
    //val overview: String,
    //val popularity: Double,
    //@SerializedName("poster_path")
    //val posterPath: String,
    //@SerializedName("release_date")
    //val releaseDate: String,
    //val revenue: Long,
    //val runtime: Int,
    //val status: String,
    //val tagline: String,
    //val title: String,
    //val video: Boolean,
    //@SerializedName("vote_average")
    //val rating: Double
//)