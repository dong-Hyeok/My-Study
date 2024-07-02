package com.donghyeok.mylog

import android.app.Application
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ApplicationClass: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}