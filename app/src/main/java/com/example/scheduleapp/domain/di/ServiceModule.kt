package com.example.scheduleapp.domain.di

import com.example.scheduleapp.data.services.SharedPreferencesServiceImpl
import com.example.scheduleapp.domain.services.SharedPreferencesService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ServiceModule {
    
    
    @Binds
    @Singleton
    abstract fun bindSharedPreferencesService(sharedPreferencesService: SharedPreferencesServiceImpl)
    : SharedPreferencesService
    
    
}