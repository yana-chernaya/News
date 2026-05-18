package com.example.news.domain.usecase

import com.example.news.domain.repository.NewsRepository
import javax.inject.Inject

class GetArticlesByTopicsUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {

    operator fun invoke(topics: List<String>) =
        newsRepository.getArticlesByTopics(topics)
}