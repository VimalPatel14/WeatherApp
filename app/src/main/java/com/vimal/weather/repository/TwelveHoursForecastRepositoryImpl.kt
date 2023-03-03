/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository

import com.vimal.weather.data.GetTwelveHoursForecastModel
import com.vimal.weather.repository.dataSource.TwelveHoursForecastDataSource
import io.reactivex.rxjava3.core.Single

class TwelveHoursForecastRepositoryImpl(val dataSource: TwelveHoursForecastDataSource) :
    TwelveHoursForecastRepository {
    override fun getTwelveHoursForecast(cityId: String): Single<ArrayList<GetTwelveHoursForecastModel>> =
        dataSource.getTwelveHoursForecast(cityId)
}