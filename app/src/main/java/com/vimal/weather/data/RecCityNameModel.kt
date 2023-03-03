/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.data

data class RecCityNameModel(

    val Key: String,
    val LocalizedName: String,
    val Country: CountryModel,
    val AdministrativeArea: OstanNameModel
)