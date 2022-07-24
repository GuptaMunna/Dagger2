package com.munna.dagger2

import android.app.Application
import com.munna.dagger2.di.DaggerUserRegistrationComponent
import com.munna.dagger2.di.UserRegistrationComponent

class MyApplication(): Application() {

    lateinit var userRegistrationComponent: UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent= DaggerUserRegistrationComponent.factory().create(5)

    }
}