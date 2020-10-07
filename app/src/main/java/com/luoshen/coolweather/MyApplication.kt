package com.luoshen.coolweather

import android.app.Application
import org.litepal.LitePal.initialize

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initialize(this)
    }
}