package com.example.starwarsapiclientkotlin

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface StarWarsService {
    @GET("people/{id}")
    fun getById(@Path("id") id: Long?): Call<People?>?
    /*
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String?): Call<List<People?>?>?

     */
}