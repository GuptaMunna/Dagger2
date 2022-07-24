package com.munna.dagger2.di

import com.munna.dagger2.model.FCMNotificationServer
import com.munna.dagger2.model.NotificationService
import com.munna.dagger2.model.SqlRepository
import com.munna.dagger2.model.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserRepoServiceModule {

    @Provides
    fun userRepoModule(sqlRepository: SqlRepository): UserRepository{
        return sqlRepository
    }
}