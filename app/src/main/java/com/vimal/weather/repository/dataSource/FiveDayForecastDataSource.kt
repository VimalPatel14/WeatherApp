/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository.dataSource

import com.vimal.weather.data.GetFutureDayForecastModel
import io.reactivex.rxjava3.core.Single

interface FiveDayForecastDataSource {
    fun getFiveDayForecast(cityId: String): Single<GetFutureDayForecastModel>
}