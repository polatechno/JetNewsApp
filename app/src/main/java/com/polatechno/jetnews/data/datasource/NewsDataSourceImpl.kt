package com.polatechno.jetnews.data.datasource

import com.polatechno.jetnews.data.api.ApiService
import com.polatechno.jetnews.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {

    override suspend fun getNewsHeadline(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadline(country)
    }


}