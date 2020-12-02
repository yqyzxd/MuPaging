package com.wind.mupaging

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import androidx.paging.cachedIn
import kotlinx.coroutines.flow.Flow

/**
 *
 *Created By wind
 *  on 12/2/20
 */
class UserViewModel(private val repository:UserRepository):ViewModel() {

    fun getUsers(city:String): Flow<PagingData<User>>{

        val newResult:Flow<PagingData<User>> =repository.getUsersStream(city)

        return newResult
    }
}