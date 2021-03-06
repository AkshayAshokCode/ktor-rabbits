package com.akshayashokcode.ktor_rabbits.data

import retrofit2.http.GET

interface RabbitsApi {

    @GET("/randomrabbit")
    suspend fun getRandomRabbit():Rabbit

    companion object{
        const val BASE_URL="http://192.168.203.40:8080/"
    }
}