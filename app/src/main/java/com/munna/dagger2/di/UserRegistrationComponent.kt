package com.munna.dagger2.di

import com.munna.dagger2.ActivityScope
import com.munna.dagger2.MainActivity
import dagger.BindsInstance
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class],modules = [NotificationServiceModule::class, UserRepoServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface factory{
        fun create(@BindsInstance retry:Int,appComponent: AppComponent): UserRegistrationComponent
    }
}