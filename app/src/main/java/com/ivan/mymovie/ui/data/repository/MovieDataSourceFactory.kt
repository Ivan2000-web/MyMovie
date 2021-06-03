package com.ivan.mymovie.ui.data.repository

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.ivan.mymovie.ui.data.api.TheMovieDBInterface
import com.ivan.mymovie.ui.data.vo.Movie
import io.reactivex.disposables.CompositeDisposable

class MovieDataSourceFactory (private val apiService : TheMovieDBInterface, private val compositeDisposable: CompositeDisposable)
    : DataSource.Factory<Int, Movie>() {

    val moviesLiveDataSource =  MutableLiveData<MovieDataSource>()

    override fun create(): DataSource<Int, Movie> {
        val movieDataSource = MovieDataSource(apiService,compositeDisposable)

        moviesLiveDataSource.postValue(movieDataSource)
        return movieDataSource
    }
}