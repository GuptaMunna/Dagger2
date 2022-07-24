package com.munna.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.munna.dagger2.di.DaggerUserRegistrationComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userR= DaggerUserRegistrationComponent.builder().build()
        userR.getUserRegService().save()
        setContentView(R.layout.activity_main)
    }
}