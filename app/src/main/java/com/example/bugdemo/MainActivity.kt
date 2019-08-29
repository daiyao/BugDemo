package com.example.bugdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.AppCenter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application,
            "c59c7737-db76-4c22-bef3-bab5b3d50fc6",
            Analytics::class.java,
            Crashes::class.java
        )
    }
}
