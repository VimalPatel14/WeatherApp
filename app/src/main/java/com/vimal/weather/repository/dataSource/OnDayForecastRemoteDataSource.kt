/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository.dataSource

import com.vimal.weather.api.ApiService
import com.vimal.weather.data.GetFutureDayForecastModel
import io.reactivex.rxjava3.core.Single

class OnDayForecastRemoteDataSource(val apiService: ApiService) : OnDayForecastDataSource {
    override fun getOnDayForecast(cityId: String): Single<GetFutureDayForecastModel> =
        apiService.getOnDayForecast(cityId)
}