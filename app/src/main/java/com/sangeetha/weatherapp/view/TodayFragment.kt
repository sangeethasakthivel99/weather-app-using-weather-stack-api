package com.sangeetha.weatherapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sangeetha.weatherapp.Current
import com.sangeetha.weatherapp.R
import com.sangeetha.weatherapp.WeatherViewModel
import com.sangeetha.weatherapp.repository.WeatherRepository
import kotlinx.android.synthetic.main.fragment_today.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TodayFragment : Fragment() {

    private var city = "India"

    private var currentWeatherList: Current? = null

    private val weatherViewModel by lazy {
        ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity().application)).get(WeatherViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_today, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        GlobalScope.launch(Dispatchers.Main) {
            val currentWeather = weatherViewModel.getTodayWeather(city).await()
            currentWeather.let {
                if (it.current != null){
                    it.current.let {
                        currentWeatherList = it
                    }
                    setDataInView()
                }
            }
        }
    }

    private fun setDataInView() {

    }
}