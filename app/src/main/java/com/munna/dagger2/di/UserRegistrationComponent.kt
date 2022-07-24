package com.munna.dagger2.di

import com.munna.dagger2.EmailService
import com.munna.dagger2.MainActivity
import com.munna.dagger2.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)
}