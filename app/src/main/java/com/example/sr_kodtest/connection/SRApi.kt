package com.example.sr_kodtest.connection

import retrofit2.http.GET

interface SRApi {
    @GET("v2/programs/popular?format=json&pagination=false")
    suspend fun getPrograms(): ProgramsResponse
}