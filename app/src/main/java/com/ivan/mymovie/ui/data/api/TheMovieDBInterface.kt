package com.ivan.mymovie.ui.data.api

import com.ivan.mymovie.ui.data.vo.MovieDetails
import com.ivan.mymovie.ui.data.vo.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {


    @GET("person/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>

    @GET("person/{person_id}")
    fun getMovieDetails(@Path("person_id") id: Int): Single<MovieDetails>
}