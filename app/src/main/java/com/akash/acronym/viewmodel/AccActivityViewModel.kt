package com.akash.acronym.viewmodel

import android.text.Editable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akash.acronym.repository.AccNetworkRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class AccActivityViewModel( private val repository: AccNetworkRepository) : ViewModel() {

    val varItemList = MutableLiveData<MutableList<LfItem>>()


    val vars  =  mutableListOf<LfItem>()

    var accText = " "

    var job: Job? = null


    fun getAllAccronyms(){
        vars.clear()
        job = viewModelScope.launch {
            val response = repository.getAccromineData(accText)


            response?.lfs?.forEach{
                vars.add(it)
            }
            varItemList.value = vars
        }
    }

    fun afterChange(acc: Editable) : String{
        accText = acc.toString()
        return accText
    }
}