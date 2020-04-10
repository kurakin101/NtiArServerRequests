package com.sobol.testserverrequests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sobol.testserverrequests.server.requests.LoginRequest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoginRequest("BananaDev", "4nN-qJE-hHp-8Lm").execute()
    }

}
