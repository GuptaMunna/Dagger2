package com.munna.dagger2

import android.util.Log
import com.munna.dagger2.model.NotificationService
import com.munna.dagger2.model.UserRepository
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(val userRepository: UserRepository,@Named("email") val notificationService: NotificationService,val analyticService: AnalyticService) {

    fun save( email:String, password:String ){
        analyticService.track()
        userRepository.saveUser(email,password)
        notificationService.notify(email)
        Log.d("test", "Save called")
    }
}