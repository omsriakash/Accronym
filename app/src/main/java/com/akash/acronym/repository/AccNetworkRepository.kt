package com.akash.acronym.repository

import com.akash.acronym.viewmodel.ApiResponseItem

class AccNetworkRepository() {

    companion object{
        val apiInterface = AccRetrofitClient.create()
    }

    suspend fun getAccromineData(accromine : String): ApiResponseItem? {
         return apiInterface.getAcromine(accromine).getOrNull(1)
    }

}