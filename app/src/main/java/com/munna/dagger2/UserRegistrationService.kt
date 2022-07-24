package com.munna.dagger2

import android.util.Log
import javax.inject.Inject

class UserRegistrationService @Inject constructor() {

    fun save(){
        Log.d("test", "Save called")
    }
}