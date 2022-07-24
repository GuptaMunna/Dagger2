package com.munna.dagger2.model

import android.util.Log
import com.munna.dagger2.ActivityScope
import javax.inject.Inject

interface UserRepository {

    fun saveUser(email:String, passwd:String)

}

@ActivityScope
 class SqlRepository @Inject constructor() : UserRepository {
     override fun saveUser(email: String, passwd: String) {

         Log.d("test","Saving to sql")
     }
 }

 class FirebaseRepository: UserRepository {
     override fun saveUser(email: String, passwd: String) {
         Log.d("test","Saving to firebase")
     }
 }
