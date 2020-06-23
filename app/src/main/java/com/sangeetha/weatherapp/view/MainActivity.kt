package com.sangeetha.weatherapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sangeetha.weatherapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  private val todayFragment = TodayFragment()
  private val weekFragment = WeekFragment()
  private val settingsFragment = SettingsFragment()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    setCurrentFragment(todayFragment)
    setUpBottomNavigation()
  }
  private fun setUpBottomNavigation() {
    bottom_nav.setOnNavigationItemSelectedListener {
      when (it.itemId) {
        R.id.today_fragment -> setCurrentFragment(todayFragment)
        R.id.week_fragment -> setCurrentFragment(weekFragment)
        R.id.settings_fragment -> setCurrentFragment(settingsFragment)
        else -> setCurrentFragment(todayFragment)
      }
      true
    }
  }

  private fun setCurrentFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction().replace(R.id.fragment_nav_host, fragment).commit()
  }
}