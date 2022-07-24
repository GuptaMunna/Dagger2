package com.munna.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.munna.dagger2.di.DaggerUserRegistrationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appcom=(application as MyApplication).appComponent
        val actComponent= DaggerUserRegistrationComponent.factory().create(3,appcom)
        actComponent.inject(this)

        userRegistrationService.save("email@email.com", "password")
        setContentView(R.layout.activity_main)
    }
}