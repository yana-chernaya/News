package com.example.news.data.repository

import com.example.news.domain.entity.Language
import com.example.news.domain.entity.Settings
import com.example.news.domain.repository.SettingsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SettingsRepositoryImpl @Inject constructor() : SettingsRepository {

    override fun getSettings(): Flow<Settings> {
        TODO("Not yet implemented")
    }

    override suspend fun updateLanguage(language: Language) {
        TODO("Not yet implemented")
    }

    override suspend fun updateInterval(minutes: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun updateNotificationsEnabled(enabled: Boolean) {
        TODO("Not yet implemented")
    }

    override suspend fun updateWifiOnly(wifiOnly: Boolean) {
        TODO("Not yet implemented")
    }

}