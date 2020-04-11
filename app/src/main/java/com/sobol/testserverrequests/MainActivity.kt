package com.sobol.testserverrequests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sobol.testserverrequests.server.model.Figure
import com.sobol.testserverrequests.server.model.Position
import com.sobol.testserverrequests.server.requests.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoginRequest("BananaDev", "4nN-qJE-hHp-8Lm").execute()
        PostStatusRequests("ready", arrayOf(Position(1,1,1,1))).execute()
        PostFiguresRequest("app", arrayOf(Figure(1,2,3,4))).execute()
        PostStandBallRequests(ArrayList(1), 45).execute()
        GetStatusRequest().execute()
        GetBallRequest().execute()
        GetFiguresRequest().execute()
    }

}
