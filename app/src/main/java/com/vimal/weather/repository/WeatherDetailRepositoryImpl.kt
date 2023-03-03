/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository

import com.vimal.weather.data.GetCurrentConditionModel
import com.vimal.weather.repository.dataSource.WeatherDetailDataSource
import io.reactivex.rxjava3.core.Single

class WeatherDetailRepositoryImpl(val dataSource: WeatherDetailDataSource) :
    WeatherDetailRepository {
    override fun getDetailWeather(cityId:String): Single<ArrayList<GetCurrentConditionModel>> =
        dataSource.getDetailWeather(cityId)

}