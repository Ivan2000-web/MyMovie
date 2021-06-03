package com.ivan.mymovie.ui.data.vo


import com.google.gson.annotations.SerializedName

data class Movie(
    val id: Int,
    @SerializedName("profile_path")
    val profile_path: String,
    @SerializedName("birthday")
    val birthday: String,
    val name: String
)