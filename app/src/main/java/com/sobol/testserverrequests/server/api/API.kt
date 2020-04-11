package com.sobol.testserverrequests.server.api

import com.sobol.testserverrequests.server.model.bodies.*
import com.sobol.testserverrequests.server.model.responses.*
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
    fun postData(@Body statusBody: StatusBody): Call<StatusResponse>

    @POST("game/figures/")
    fun postFigures(@Body figuresBody: FiguresBody): Call<FiguresResponse>

    @POST("game/stand/ball/")
    fun postStandBall(@Body standBallBody: StandBallBody): Call<StandBallResponse>

    @GET("game/ball/")
    fun getBall(): Call<BallResponse>

    @GET("game/figures/")
    fun getFigures(): Call<FiguresResponse>



}