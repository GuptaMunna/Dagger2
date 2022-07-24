package com.munna.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.munna.dagger2.di.DaggerUserRegistrationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val userR= DaggerUserRegistrationComponent.builder().build()
        userR.inject(this)
        userRegistrationService.save()
        emailService.sent()
        setContentView(R.layout.activity_main)
    }
}