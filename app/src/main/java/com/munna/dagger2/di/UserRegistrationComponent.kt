package com.munna.dagger2.di

import com.munna.dagger2.MainActivity
import dagger.Component

@Component(modules = [NotificationServiceModule::class, UserRepoServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)
}