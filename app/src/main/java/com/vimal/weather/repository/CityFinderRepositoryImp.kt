/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.repository

import com.vimal.weather.data.RecCityNameModel
import com.vimal.weather.repository.dataSource.CityFinderDataSource
import io.reactivex.rxjava3.core.Single

class CityFinderRepositoryImp(val remoteDataSource: CityFinderDataSource) : CityFinderRepository {

    override fun getCityName(cityName: String): Single<ArrayList<RecCityNameModel>> =
        remoteDataSource.getCityName(cityName)

    override fun saveCityId(cityId: String) {
        remoteDataSource.saveCityId(cityId)
    }

    override fun readCityId(): String? =
        remoteDataSource.readCityId()


    override fun cleanCityId() {
       remoteDataSource.cleanCityId()
    }
}