package com.wind.mupaging

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *
 *Created By wind
 *  on 12/2/20
 */
data class User(
    val uid:String,val name:String,val gender:String,val age:Int,
                val high:String,val abode:String,val avatar:String,
                val plan_marry_time:String,val annual_income:String,val vip:Int)