/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository

import com.vimal.weather.data.GetTwelveHoursForecastModel
import io.reactivex.rxjava3.core.Single

interface TwelveHoursForecastRepository {
    fun getTwelveHoursForecast(cityId: String): Single<ArrayList<GetTwelveHoursForecastModel>>
}