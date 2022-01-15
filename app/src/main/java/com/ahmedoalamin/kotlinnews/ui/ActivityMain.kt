package com.ahmedoalamin.kotlinnews.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModelProviders


import androidx.navigation.Navigation

import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.NavigationUI


import com.ahmedoalamin.kotlinnews.R
import com.ahmedoalamin.kotlinnews.api.ApiHelper
import com.ahmedoalamin.kotlinnews.api.RetrofitBuilder
import com.ahmedoalamin.kotlinnews.ui.base.ViewModelFactory


class ActivityMain : AppCompatActivity() {


    //adding splash screen feature
    private val viewModelx: ViewModelExample by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        installSplashScreen().apply {
            setKeepVisibleCondition {
                viewModelx.isLoading.value
            }
            setContentView(R.layout.activity_main)
        }

        val navView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        //Initialize NavController.
        val navController = Navigation.findNavController(this, R.id.newsNavHostFragment)
        NavigationUI.setupWithNavController(navView, navController)

    }

}