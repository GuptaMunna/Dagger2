package com.munna.dagger2

import android.util.Log
import javax.inject.Inject

class AnalyticService {

    fun track(){
        Log.d("test", "Tracking on server")
    }
}