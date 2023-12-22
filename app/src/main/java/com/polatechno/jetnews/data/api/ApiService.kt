package com.polatechno.jetnews.data.api

import com.polatechno.jetnews.data.AppConstants
import com.polatechno.jetnews.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("category") category: String = AppConstants.NEWS_CATEGORY,
        @Query("apiKey") apiKey: String = AppConstants.API_KEY,
    ): Response<NewsResponse>
}

//https://newsapi.org/v2/top-headlines?
// country=us
// &category=business
// &apiKey=6e80a6b3b8574f35b15893578068b960
