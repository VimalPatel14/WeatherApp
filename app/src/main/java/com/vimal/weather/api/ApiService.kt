/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.api

import com.vimal.weather.common.API_ID
import com.vimal.weather.data.GetCurrentConditionModel
import com.vimal.weather.data.GetFutureDayForecastModel
import com.vimal.weather.data.GetTwelveHoursForecastModel
import com.vimal.weather.data.RecCityNameModel
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import io.reactivex.rxjava3.core.Single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("locations/v1/cities/search")
    fun getCityList(
        @Query("apikey") apikey: String = API_ID,
        @Query("q") cityName: String
    ): Single<ArrayList<RecCityNameModel>>

    @GET("currentconditions/v1/{cityId}")
    fun detailWeather(
        @Path("cityId") cityId: String,
        @Query("apikey") apikey: String = API_ID,
        @Query("details") details: Boolean = true
    ): Single<ArrayList<GetCurrentConditionModel>>

    @GET("forecasts/v1/daily/1day/{cityId}")
    fun getOnDayForecast(
        @Path("cityId") cityId: String,
        @Query("apikey") apikey: String = API_ID,
        @Query("details") details: Boolean = true,
        @Query("metric") metric: Boolean = true
    ): Single<GetFutureDayForecastModel>

    @GET("forecasts/v1/hourly/12hour/{cityId}")
    fun getTwelveHoursForecast(
        @Path("cityId") cityId:String,
        @Query("apikey") apikey: String = API_ID,
        @Query("details") details: Boolean = true,
        @Query("metric") metric: Boolean = true
    ):Single<ArrayList<GetTwelveHoursForecastModel>>

    @GET("forecasts/v1/daily/5day/{cityId}")
    fun getFiveDayForecast(
        @Path("cityId") cityId:String,
        @Query("apikey") apikey: String = API_ID,
        @Query("details") details: Boolean = true,
        @Query("metric") metric: Boolean = true
    ):Single<GetFutureDayForecastModel>

}

fun createApiServiceInstance(): ApiService {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://dataservice.accuweather.com/")
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    return retrofit.create(ApiService::class.java)

}