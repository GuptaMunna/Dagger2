package com.munna.dagger2.di

import com.munna.dagger2.model.FCMNotificationServer
import com.munna.dagger2.model.NotificationService
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun fcmNotificationModule(): NotificationService{
        return FCMNotificationServer()
    }
}