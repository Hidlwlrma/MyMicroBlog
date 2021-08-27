package com.example.mymicroblog

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MyMicroBlogApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "2.00nGvFqGwrj_vD85f565c1c0a6gkSE"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}