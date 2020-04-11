package com.sobol.testserverrequests.server.requests

import com.sobol.testserverrequests.server.Constants
import com.sobol.testserverrequests.server.api.API
import com.sobol.testserverrequests.server.model.bodies.FiguresBody
import com.sobol.testserverrequests.server.model.bodies.StatusBody
import com.sobol.testserverrequests.server.model.responses.FiguresResponse
import com.sobol.testserverrequests.server.model.responses.StatusResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostFiguresRequest(
    private val sender: String,
    private val figures: ArrayList<Int>,
    private val x: Int,
    private val y: Int,
    private val angle: Int
) {

    fun execute() {
        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.serverUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(API::class.java)

        val body = FiguresBody(
            sender,
            figures,
            x,y,
            angle
        )
        val call = api.postFigures(body)
        call.enqueue(object : Callback<FiguresResponse> {
            override fun onFailure(call: Call<FiguresResponse>, t: Throwable) {
                println("FAIL RESPONCE == ${t.message}")
            }

            override fun onResponse(call: Call<FiguresResponse>, response: Response<FiguresResponse>) {
                if (response.isSuccessful) {
                    println("SUCCESS SUCECESS")
                    println(response.body()?.code)
                } else {
                    println("NO SUCCESS")
                }
            }
        })
    }

}