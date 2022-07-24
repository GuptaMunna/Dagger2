package com.munna.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EmailService @Inject constructor () {

    fun sent(){
        Log.d("test", "Emails sent")
    }
}