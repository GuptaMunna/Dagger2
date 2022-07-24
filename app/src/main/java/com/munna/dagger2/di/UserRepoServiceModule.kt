package com.munna.dagger2.di

import com.munna.dagger2.model.FCMNotificationServer
import com.munna.dagger2.model.NotificationService
import com.munna.dagger2.model.SqlRepository
import com.munna.dagger2.model.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepoServiceModule {

    @Binds
    abstract fun userRepoModule(sqlRepository: SqlRepository): UserRepository
}