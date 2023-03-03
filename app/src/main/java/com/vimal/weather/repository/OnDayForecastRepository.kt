/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository

import com.vimal.weather.data.GetFutureDayForecastModel
import io.reactivex.rxjava3.core.Single

interface OnDayForecastRepository {
    fun getOnDayForecast(cityId: String): Single<GetFutureDayForecastModel>
}