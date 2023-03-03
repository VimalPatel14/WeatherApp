/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository

import com.vimal.weather.data.GetFutureDayForecastModel
import com.vimal.weather.repository.dataSource.OnDayForecastDataSource
import io.reactivex.rxjava3.core.Single

class OnDayForecastRepositoryImpl(val dataSource: OnDayForecastDataSource) :
    OnDayForecastRepository {
    override fun getOnDayForecast(cityId: String): Single<GetFutureDayForecastModel> =
        dataSource.getOnDayForecast(cityId)

}