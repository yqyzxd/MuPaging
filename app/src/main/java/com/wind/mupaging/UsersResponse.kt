package com.wind.mupaging

import com.google.gson.annotations.SerializedName

/**
 *
 *Created By wind
 *  on 12/2/20
 */
data class UsersResponse(
    val err:Int,
    val msg:String,
    @field:SerializedName("items")
    val items:List<User>
)
