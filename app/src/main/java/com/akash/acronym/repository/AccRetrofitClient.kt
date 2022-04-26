package com.akash.acronym.repository

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class AccRetrofitClient {

    companion object{
        private const val BASE_URL = "http://www.nactem.ac.uk/software/acromine/"

        fun create() : ApiInterface = retrofit.create(ApiInterface::class.java)

        private val retrofit : Retrofit by lazy {
            Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .baseUrl(BASE_URL)
                .build()
        }

        private val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build();


    }
}