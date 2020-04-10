package com.sobol.testserverrequests.server.api

import com.sobol.testserverrequests.server.model.bodies.RegistrationBody
import com.sobol.testserverrequests.server.model.responses.RegistrationResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface API {

    @POST("auth/login/")
    fun registerUser(@Body registrationBody: RegistrationBody): Call<RegistrationResponse>

}