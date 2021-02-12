package com.example.starwarsapiclientkotlin

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.jackson.JacksonConverterFactory

class StarWarsApplication: Application() {
    var service: StarWarsService? = null
    override fun onCreate() {
        super.onCreate()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://swapi.dev/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(StarWarsService::class.java)
    }
}