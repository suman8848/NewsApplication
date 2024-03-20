package com.myapplication.sumankhatiwada.di.components

import android.content.Context
import android.net.Network
import com.myapplication.sumankhatiwada.NewsApplication
import com.myapplication.sumankhatiwada.data.api.NetworkService
import com.myapplication.sumankhatiwada.di.ApplicationContext
import com.myapplication.sumankhatiwada.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(myApplication: NewsApplication)

    @ApplicationContext
    fun getContext(): Context

    fun networkService(): NetworkService
}