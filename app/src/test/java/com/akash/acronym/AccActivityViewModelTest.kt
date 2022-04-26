package com.akash.acronym

import com.akash.acronym.repository.AccNetworkRepository
import com.akash.acronym.viewmodel.AccActivityViewModel
import com.akash.acronym.viewmodel.ApiResponseItem
import org.junit.Test

import org.junit.Assert.*
import org.mockito.kotlin.mock
import java.lang.Math.random

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AccActivityViewModelTest {

    private val accNetworkRepository : AccNetworkRepository = mock()
    private val testOject = AccActivityViewModel(accNetworkRepository)

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun whenDataNull(){
        //val response = ApiResponseItem()

        testOject.getAllAccronyms().equals(null)

    }


}