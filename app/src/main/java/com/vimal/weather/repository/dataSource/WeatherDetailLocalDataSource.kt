/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository.dataSource

import com.vimal.weather.api.ApiService
import com.vimal.weather.data.GetCurrentConditionModel
import io.reactivex.rxjava3.core.Single

class WeatherDetailLocalDataSource(val apiService: ApiService) :
    WeatherDetailDataSource {

    override fun getDetailWeather(cityId: String): Single<ArrayList<GetCurrentConditionModel>> =
        apiService.detailWeather(cityId)

}