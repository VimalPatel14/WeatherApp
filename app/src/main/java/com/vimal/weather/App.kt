/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.vimal.weather.api.createApiServiceInstance
import com.vimal.weather.repository.*
import com.vimal.weather.repository.dataSource.*
import com.vimal.weather.viewModel.*
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val myModules = module {
            single { createApiServiceInstance() }
            single<SharedPreferences> { this@App.getSharedPreferences("Data", MODE_PRIVATE) }
            single<Context> { applicationContext }

            factory<CityFinderRepository> {
                CityFinderRepositoryImp(
                    CityFinderRemoteDataSource(get(), get(),get())
                )
            }

            factory<WeatherDetailRepository> {
                WeatherDetailRepositoryImpl(
                    WeatherDetailLocalDataSource(get())
                )
            }

            factory<OnDayForecastRepository> {
                OnDayForecastRepositoryImpl(OnDayForecastRemoteDataSource(get()))
            }

            factory<TwelveHoursForecastRepository> {
                TwelveHoursForecastRepositoryImpl(
                    TwelveHoursForecastRemoteDataSource(get())
                )
            }

            factory<FiveDayForecastRepository> {
                FiveDayForecastRepositoryImpl(FiveDayForecastRemoteDataSource(get()))
            }

            viewModel { CityFinderViewModel(get()) }
            viewModel { WeatherDetailViewModel(get()) }
            viewModel { OnDayForecastViewModel(get()) }
            viewModel { TwelveHoursForecastViewModel(get()) }
            viewModel { FiveDayForecastViewModel(get()) }

        }
        startKoin {
            androidContext(this@App)
            modules(myModules)
        }
    }
}