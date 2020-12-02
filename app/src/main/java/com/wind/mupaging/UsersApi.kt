package com.wind.mupaging

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


/**
 *
 *Created By wind
 *  on 12/2/20
 */
interface UsersApi {

    @GET("user_city")
    suspend fun getUsers(@Query("city") city:String,
                         @Query("page") page:Int,
                         @Query("limit") limit:Int
                         ):UsersResponse



    companion object{

        private const val BASE_URL="http://mutest.xkdmp.com/"

        fun create():UsersApi{
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UsersApi::class.java)
        }
    }
}