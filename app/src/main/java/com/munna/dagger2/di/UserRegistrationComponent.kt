package com.munna.dagger2.di

import com.munna.dagger2.ActivityScope
import com.munna.dagger2.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [NotificationServiceModule::class, UserRepoServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance retry:Int): UserRegistrationComponent
    }
}