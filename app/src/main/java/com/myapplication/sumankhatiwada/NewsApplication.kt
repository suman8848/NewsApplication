package com.myapplication.sumankhatiwada

import android.app.Application
import com.myapplication.sumankhatiwada.di.components.ApplicationComponent
import com.myapplication.sumankhatiwada.di.components.DaggerApplicationComponent
import com.myapplication.sumankhatiwada.di.modules.ApplicationModule

class NewsApplication: Application() {

  private lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
      injectDependencies()
    }

    private fun injectDependencies(){
        applicationComponent = DaggerApplicationComponent
          .builder()
          .applicationModule(ApplicationModule(this))
          .build()
      applicationComponent.inject(this)
    }
}