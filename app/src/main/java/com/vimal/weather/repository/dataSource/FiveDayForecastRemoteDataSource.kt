/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository.dataSource

import com.vimal.weather.api.ApiService
import com.vimal.weather.data.GetFutureDayForecastModel
import io.reactivex.rxjava3.core.Single

class FiveDayForecastRemoteDataSource(val apiService: ApiService) : FiveDayForecastDataSource {
    override fun getFiveDayForecast(cityId: String): Single<GetFutureDayForecastModel> =
        apiService.getFiveDayForecast(cityId)
}