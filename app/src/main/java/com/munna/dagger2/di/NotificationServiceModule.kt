package com.munna.dagger2.di

import com.munna.dagger2.model.EmailService
import com.munna.dagger2.model.FCMNotificationServer
import com.munna.dagger2.model.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Named("fcm")
    @Provides
    fun fcmNotificationModule(): NotificationService{
        return FCMNotificationServer()
    }

    @Named("email")
    @Provides
    fun emailNotificationModule(retry:Int): NotificationService{
        return EmailService(retry)
    }
}