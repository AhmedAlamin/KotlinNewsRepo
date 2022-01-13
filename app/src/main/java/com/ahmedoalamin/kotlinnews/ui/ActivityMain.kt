package com.ahmedoalamin.kotlinnews.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


import androidx.navigation.Navigation

import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.NavigationUI


import com.ahmedoalamin.kotlinnews.R


class ActivityMain : AppCompatActivity() {

    //adding splash screen feature
    private val viewModel: ViewModelExample by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        installSplashScreen().apply {
            setKeepVisibleCondition {
                viewModel.isLoading.value
            }
            setContentView(R.layout.activity_main)

        }

        val navView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

//        //Pass the ID's of Different destinations
//        val appBarConfiguration: AppBarConfiguration = AppBarConfiguration.Builder(
//            R.id.newsFragment
//        )
//            .build()

        //Initialize NavController.
        val navController = Navigation.findNavController(this, R.id.newsNavHostFragment)
        NavigationUI.setupWithNavController(navView, navController)

    }
}