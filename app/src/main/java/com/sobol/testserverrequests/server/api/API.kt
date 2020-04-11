package com.sobol.testserverrequests.server.api

import com.sobol.testserverrequests.server.model.bodies.BallBody
import com.sobol.testserverrequests.server.model.bodies.RegistrationBody
import com.sobol.testserverrequests.server.model.bodies.StatusBody
import com.sobol.testserverrequests.server.model.responses.BallResponse
import com.sobol.testserverrequests.server.model.responses.FiguresResponse
import com.sobol.testserverrequests.server.model.responses.RegistrationResponse
import com.sobol.testserverrequests.server.model.responses.StatusResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface API {

    @POST("auth/login/")
    fun registerUser(@Body registrationBody: RegistrationBody): Call<RegistrationResponse>

    @GET("game/status/")
    fun getData(): Call<StatusResponse>

    @POST("game/status/")
    fun postData(@Body statusBody: StatusBody)

    @GET("game/ball/")
    fun getBall(): Call<BallResponse>

    @GET("game/figures/")
    fun getFigures(): Call<FiguresResponse>



}