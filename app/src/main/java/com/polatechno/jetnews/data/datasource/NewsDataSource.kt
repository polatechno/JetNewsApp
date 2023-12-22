package com.polatechno.jetnews.data.datasource

import com.polatechno.jetnews.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    suspend fun getNewsHeadline(country: String): Response<NewsResponse>
}