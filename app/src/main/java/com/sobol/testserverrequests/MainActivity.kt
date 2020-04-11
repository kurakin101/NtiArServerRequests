package com.sobol.testserverrequests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sobol.testserverrequests.server.requests.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoginRequest("BananaDev", "4nN-qJE-hHp-8Lm").execute()
        PostStatusRequests("ready", ArrayList(1)).execute()
        PostFiguresRequest("app", ArrayList(1),1,2, 45).execute()
        PostStandBallRequests(ArrayList(1), 45).execute()
        GetStatusRequest().execute()
        GetBallRequest().execute()
        GetFiguresRequest().execute()
    }

}
