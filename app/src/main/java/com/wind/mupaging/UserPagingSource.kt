package com.wind.mupaging
import androidx.paging.PagingSource
/**
 *
 *Created By wind
 *  on 12/2/20
 */
private const val STARTING_PAGE_INDEX = 1
class UserPagingSource(
    private val api: UsersApi,
    private val city: String
) : PagingSource<Int, User>(){

    override suspend fun load(params:LoadParams<Int>):LoadResult<Int,User>{
        val page=params.key?:STARTING_PAGE_INDEX

        return try {
            val response=api.getUsers(city,page,params.loadSize)
            var users=response.items
            LoadResult.Page(data = users,
            prevKey =if (page== STARTING_PAGE_INDEX) null else page -1 ,
            nextKey = page+1)
        }catch (e:Exception){
            LoadResult.Error(e)
        }

    }

}