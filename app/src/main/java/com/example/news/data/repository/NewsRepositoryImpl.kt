package com.example.news.data.repository

import com.example.news.domain.entity.Article
import com.example.news.domain.entity.Language
import com.example.news.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(): NewsRepository {
    
    override fun getAllSubscriptions(): Flow<List<String>> {
        TODO("Not yet implemented")
    }

    override suspend fun addSubscription(topic: String) {
        TODO("Not yet implemented")
    }

    override suspend fun updateArticlesForTopic(topic: String, language: Language) {
        TODO("Not yet implemented")
    }

    override suspend fun removeSubscription(topic: String) {
        TODO("Not yet implemented")
    }

    override suspend fun updateArticlesForAllSubscriptions(language: Language) {
        TODO("Not yet implemented")
    }

    override fun getArticlesByTopics(topics: List<String>): Flow<List<Article>> {
        TODO("Not yet implemented")
    }

    override suspend fun clearAllArticles(topics: List<String>) {
        TODO("Not yet implemented")
    }
}