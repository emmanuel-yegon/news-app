package com.emmanuel_yegon.newsapp.domain.useCases

import com.emmanuel_yegon.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow


class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}