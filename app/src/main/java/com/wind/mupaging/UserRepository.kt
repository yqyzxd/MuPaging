package com.wind.mupaging

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow

/**
 *
 *Created By wind
 *  on 12/2/20
 */
class UserRepository(private val api:UsersApi) {

    fun getUsersStream(city:String): Flow<PagingData<User>>{
        return Pager(
            config = PagingConfig(enablePlaceholders = false,pageSize = NETWORK_PAGE_SIZE),
            pagingSourceFactory = {UserPagingSource(api,city)}
        ).flow
    }

    companion object{
        private const val NETWORK_PAGE_SIZE=20
    }
}