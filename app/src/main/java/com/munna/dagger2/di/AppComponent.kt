package com.munna.dagger2.di

import com.munna.dagger2.AnalyticModule
import com.munna.dagger2.AnalyticService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticModule::class])
interface AppComponent {

    fun getAnalytic():AnalyticService
}