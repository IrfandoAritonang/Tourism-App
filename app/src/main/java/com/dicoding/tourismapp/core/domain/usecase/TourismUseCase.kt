package com.dicoding.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.bumptech.glide.load.engine.Resource
import com.dicoding.tourismapp.core.domain.model.Tourism

interface TourismUseCase {
    fun getAllTourism(): LiveData<com.dicoding.tourismapp.core.data.Resource<List<Tourism>>>
    fun getFavoriteTourism(): LiveData<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}