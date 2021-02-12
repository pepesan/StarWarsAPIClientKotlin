package com.example.starwarsapiclientkotlin

import android.util.Log
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class StarWarsViewModel(val service: StarWarsService) : ViewModel() {

    var selectedItem: MutableLiveData<People>? = null
    init {
        selectedItem?.value = People()
    }

    fun getPeopleById(id:Long) {
        val response = service.getById(id)
        Log.d("app"," repos: $response")
        response?.enqueue(object : Callback<People?> {
            override fun onResponse(call: Call<People?>?, response: Response<People?>?){
                val respuesta = response?.body()
                Log.d("app","Respuesta: $respuesta")
                selectedItem?.value= respuesta
            }

            /**
             * Invoked when a network exception occurred talking to the server or when an unexpected
             * exception occurred creating the request or processing the response.
             */
            override fun onFailure(call: Call<People?>?, t: Throwable?){
                Log.d("app","Error: Respuesta: $t")
            }
        })

    }
}

class StarWarsViewModelFactory(private val service: StarWarsService?) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(StarWarsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return StarWarsViewModel(service!!) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

