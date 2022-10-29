package com.sega.weatherappcompose.di

import com.sega.weatherappcompose.data.repository.WeatherRepositoryImpl
import com.sega.weatherappcompose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}