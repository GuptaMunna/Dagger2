package com.munna.dagger2

import android.app.Application
import com.munna.dagger2.di.AppComponent
import com.munna.dagger2.di.DaggerAppComponent

class MyApplication(): Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent=DaggerAppComponent.builder().build()

    }
}