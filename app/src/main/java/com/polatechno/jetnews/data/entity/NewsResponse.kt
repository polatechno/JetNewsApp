package com.polatechno.jetnews.data.entity

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)