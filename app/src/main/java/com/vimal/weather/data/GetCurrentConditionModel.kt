/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.data

data class GetCurrentConditionModel(
    val LocalObservationDateTime: String,
    val WeatherText: String,
    val WeatherIcon:Int,
    val Temperature:CurrentTemperatureModel,
    val Wind: CurrentWindModel
)
