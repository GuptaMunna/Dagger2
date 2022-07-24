package com.munna.dagger2.di

import com.munna.dagger2.ActivityScope
import com.munna.dagger2.model.FCMNotificationServer
import com.munna.dagger2.model.NotificationService
import com.munna.dagger2.model.SqlRepository
import com.munna.dagger2.model.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepoServiceModule {

    @Binds
    @ActivityScope
    abstract fun userRepoModule(sqlRepository: SqlRepository): UserRepository
}