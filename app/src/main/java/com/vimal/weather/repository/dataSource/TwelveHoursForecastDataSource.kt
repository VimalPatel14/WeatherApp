/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository.dataSource

import com.vimal.weather.data.GetTwelveHoursForecastModel
import io.reactivex.rxjava3.core.Single

interface TwelveHoursForecastDataSource {
    fun getTwelveHoursForecast(cityId: String): Single<ArrayList<GetTwelveHoursForecastModel>>
}