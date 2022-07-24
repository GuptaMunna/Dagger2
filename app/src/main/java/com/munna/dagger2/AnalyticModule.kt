package com.munna.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticModule {

    @Provides
    @Singleton
     fun getAnalytic():AnalyticService{
         return  AnalyticService()
     }
}