package com.akash.acronym.repository

import com.akash.acronym.viewmodel.ApiResponseItem
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("dictionary.py")
    suspend fun getAcromine(@Query("sf") acromine:String) : List<ApiResponseItem>
}