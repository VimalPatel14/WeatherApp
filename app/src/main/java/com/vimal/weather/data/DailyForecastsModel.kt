/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.data

data class DailyForecastsModel(
    val Date: String,
    val Sun: SunModel,
    val Moon: MoonModel,
    val Temperature: TemperatureModel,
    val RealFeelTemperature: TemperatureModel,
    val Day: DayNightModel,
    val Night: DayNightModel
)
