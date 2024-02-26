package com.emmanuel_yegon.newsapp.di

import android.app.Application
import com.emmanuel_yegon.newsapp.data.manager.LocalUserManagerImpl
import com.emmanuel_yegon.newsapp.domain.manager.LocalUserManager
import com.emmanuel_yegon.newsapp.domain.useCases.AppEntryUseCases
import com.emmanuel_yegon.newsapp.domain.useCases.ReadAppEntry
import com.emmanuel_yegon.newsapp.domain.useCases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager=LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}