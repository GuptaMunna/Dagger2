package com.munna.dagger2

import android.util.Log
import com.munna.dagger2.model.NotificationService
import com.munna.dagger2.model.UserRepository
import javax.inject.Inject

class UserRegistrationService @Inject constructor(val userRepository: UserRepository,val notificationService: NotificationService) {

    fun save( email:String, password:String ){
        userRepository.saveUser(email,password)
        notificationService.notify(email)
        Log.d("test", "Save called")
    }
}