package com.emmanuel_yegon.newsapp.domain.useCases

import com.emmanuel_yegon.newsapp.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}