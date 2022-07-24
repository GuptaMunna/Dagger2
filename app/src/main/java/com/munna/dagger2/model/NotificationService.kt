package com.munna.dagger2.model

import android.util.Log

interface NotificationService {
    fun notify(email: String)
}

class EmailService : NotificationService {
    override fun notify(email: String) {
        Log.d("test", " Email notification sent $email")
    }

}

class FCMNotificationServer : NotificationService {
    override fun notify(email: String) {
        Log.d("test", "Fcm notification sent $email")
    }

}