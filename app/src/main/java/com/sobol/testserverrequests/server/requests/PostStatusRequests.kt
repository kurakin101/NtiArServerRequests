//package com.sobol.testserverrequests.server.requests
//
//import com.sobol.testserverrequests.server.Constants
//import com.sobol.testserverrequests.server.api.API
//import com.sobol.testserverrequests.server.model.bodies.RegistrationBody
//import com.sobol.testserverrequests.server.model.bodies.StatusBody
//import com.sobol.testserverrequests.server.model.responses.RegistrationResponse
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//class PostStatusRequests(
//    private val action: String,
//    private val positions: ArrayList<Int>
//) {
//
//    fun execute() {
//        val retrofit = Retrofit.Builder()
//            .baseUrl(Constants.serverUrl)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        val api = retrofit.create(API::class.java)
//
//        val body = StatusBody(
//            action,
//            positions
//        )
//        val call = api.postData(body)
//        call.enqueue(object : Callback<StatusBody> {
//            override fun onFailure(call: Call<StatusBody>, t: Throwable) {
//                println("FAIL RESPONCE == ${t.message}")
//            }
//
//            override fun onResponse(call: Call<StatusBody>, response: Response<StatusBody>) {
//                if (response.isSuccessful) {
//                    println("SUCCESS SUCECESS")
//                    println(response.body()?.key)
//                } else {
//                    println("NO SUCCESS")
//                }
//            }
//        })
//    }
//
//}