/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository.dataSource

import com.vimal.weather.api.ApiService
import com.vimal.weather.data.GetTwelveHoursForecastModel
import io.reactivex.rxjava3.core.Single

class TwelveHoursForecastRemoteDataSource(val apiService: ApiService):TwelveHoursForecastDataSource {
    override fun getTwelveHoursForecast(cityId: String): Single<ArrayList<GetTwelveHoursForecastModel>> =
        apiService.getTwelveHoursForecast(cityId)
}