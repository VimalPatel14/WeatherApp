/**
 * Created by Vimal on March-2023.
 */
package com.vimal.weather.viewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vimal.weather.common.ShowLoading
import com.vimal.weather.data.GetFutureDayForecastModel
import com.vimal.weather.repository.FiveDayForecastRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers

class FiveDayForecastViewModel(val repository: FiveDayForecastRepository):ViewModel() {
    val compositeDisposable: CompositeDisposable = CompositeDisposable()
    val liveData: LiveData<GetFutureDayForecastModel> get() = _liveData
    private val _liveData: MutableLiveData<GetFutureDayForecastModel> = MutableLiveData()
    private lateinit var showLoading: ShowLoading

    fun sendOnDayForecastApi(context: Context, cityId: String) {
        showLoading = ShowLoading(context)
        compositeDisposable.add(
            repository.getFiveDayForecast(cityId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<GetFutureDayForecastModel>() {
                    override fun onSuccess(t: GetFutureDayForecastModel) {
                        _liveData.value = t
                        showLoading.dismissDialog()

                    }

                    override fun onError(e: Throwable) {
                        e.printStackTrace()
                    }

                })
        )

    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}