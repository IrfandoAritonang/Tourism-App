package com.dicoding.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.bumptech.glide.load.engine.Resource
import com.dicoding.tourismapp.core.domain.model.Tourism
import io.reactivex.Flowable

interface TourismUseCase {
    fun getAllTourism(): Flowable<com.dicoding.tourismapp.core.data.Resource<List<Tourism>>>
    fun getFavoriteTourism(): Flowable<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}