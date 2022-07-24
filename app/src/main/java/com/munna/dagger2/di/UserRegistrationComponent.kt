package com.munna.dagger2.di

import com.munna.dagger2.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegService():UserRegistrationService
}