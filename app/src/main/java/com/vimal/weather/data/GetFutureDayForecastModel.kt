/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.data

data class GetFutureDayForecastModel(
    val Headline: HeadlineModel,
    val DailyForecasts: ArrayList<DailyForecastsModel>
)
