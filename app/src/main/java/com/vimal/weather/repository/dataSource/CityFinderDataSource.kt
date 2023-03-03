/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository.dataSource

import com.vimal.weather.data.RecCityNameModel
import io.reactivex.rxjava3.core.Single

interface CityFinderDataSource {

    fun getCityName(cityName: String): Single<ArrayList<RecCityNameModel>>
    fun saveCityId(cityId:String)
    fun readCityId(): String?
    fun cleanCityId()

}