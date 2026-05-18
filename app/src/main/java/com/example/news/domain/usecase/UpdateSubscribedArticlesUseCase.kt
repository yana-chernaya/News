package com.example.news.domain.usecase

import com.example.news.domain.repository.NewsRepository
import com.example.news.domain.repository.SettingsRepository
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class UpdateSubscribedArticlesUseCase @Inject constructor(
    private val newsRepository: NewsRepository,
    private val settingsRepository: SettingsRepository
) {

    suspend operator fun invoke() {
        val settings = settingsRepository.getSettings().first()
        newsRepository.updateArticlesForAllSubscriptions(settings.language)
    }
}