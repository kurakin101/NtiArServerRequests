package com.sobol.testserverrequests.server.requests

import com.sobol.testserverrequests.server.Constants
import com.sobol.testserverrequests.server.api.API
import com.sobol.testserverrequests.server.model.bodies.RegistrationBody
import com.sobol.testserverrequests.server.model.bodies.StatusBody
import com.sobol.testserverrequests.server.model.responses.RegistrationResponse
import com.sobol.testserverrequests.server.model.responses.StatusResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GetStatusRequest(

) {

    fun execute() {
        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.serverUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(API::class.java)

        val call = api.getData()
        call.enqueue(object : Callback<StatusResponse> {
            override fun onFailure(call: Call<StatusResponse>, t: Throwable) {
                println("FAIL RESPONCE == ${t.message}")
            }

            override fun onResponse(call: Call<StatusResponse>, response: Response<StatusResponse>) {
                if (response.isSuccessful) {
                    println("SUCCESS getStatus")
                    println(response.body()?.status)
                    println(response.body()?.status_message)
                    println(response.body()?.current_team)
                    println(response.body()?.remaining_time)
                } else {
                    println("NO SUCCESS getStatus")
                }
            }
        })
    }

}