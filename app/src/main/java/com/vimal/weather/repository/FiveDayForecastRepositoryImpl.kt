/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository

import com.vimal.weather.data.GetFutureDayForecastModel
import com.vimal.weather.repository.dataSource.FiveDayForecastDataSource
import io.reactivex.rxjava3.core.Single

class FiveDayForecastRepositoryImpl(val dataSource: FiveDayForecastDataSource) :
    FiveDayForecastRepository {
    override fun getFiveDayForecast(cityId: String): Single<GetFutureDayForecastModel> =
        dataSource.getFiveDayForecast(cityId)

}