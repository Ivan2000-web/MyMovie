package com.ivan.mymovie.ui.single_movie_details

import androidx.lifecycle.LiveData
import com.ivan.mymovie.ui.data.api.TheMovieDBInterface
import com.ivan.mymovie.ui.data.repository.MovieDetailsNetworkDataSource
import com.ivan.mymovie.ui.data.repository.NetworkState
import com.ivan.mymovie.ui.data.vo.MovieDetails

import io.reactivex.disposables.CompositeDisposable

class MovieDetailsRepository (private val apiService : TheMovieDBInterface) {

    lateinit var movieDetailsNetworkDataSource: MovieDetailsNetworkDataSource

    fun fetchSingleMovieDetails (compositeDisposable: CompositeDisposable, movieId: Int) : LiveData<MovieDetails> {

        movieDetailsNetworkDataSource = MovieDetailsNetworkDataSource(apiService,compositeDisposable)
        movieDetailsNetworkDataSource.fetchMovieDetails(movieId)

        return movieDetailsNetworkDataSource.downloadedMovieResponse

    }

    fun getMovieDetailsNetworkState(): LiveData<NetworkState> {
        return movieDetailsNetworkDataSource.networkState
    }



}