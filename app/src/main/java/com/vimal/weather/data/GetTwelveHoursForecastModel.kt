/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.data

data class GetTwelveHoursForecastModel(
    val DateTime: String,
    val WeatherIcon: Int,
    val Temperature: TemperatureDetailModel,
    val Wind: WindModel
)
