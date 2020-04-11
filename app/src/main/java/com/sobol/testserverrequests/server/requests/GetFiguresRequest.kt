package com.sobol.testserverrequests.server.requests

import com.sobol.testserverrequests.server.Constants
import com.sobol.testserverrequests.server.api.API
import com.sobol.testserverrequests.server.model.responses.BallResponse
import com.sobol.testserverrequests.server.model.responses.FiguresResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GetFiguresRequest(

) {

    fun execute() {
        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.serverUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(API::class.java)

        val call = api.getFigures()
        call.enqueue(object : Callback<FiguresResponse> {
            override fun onFailure(call: Call<FiguresResponse>, t: Throwable) {
                println("FAIL RESPONCE == ${t.message}")
            }

            override fun onResponse(call: Call<FiguresResponse>, response: Response<FiguresResponse>) {
                if (response.isSuccessful) {
                    println("SUCCESS getFigures")
                    println(response.body()?.x)
                    println(response.body()?.y)
                    println(response.body()?.angel)
                    println(response.body()?.modifier)
                } else {
                    println("NO SUCCESS getFigures")
                }
            }
        })
    }
}