package com.wind.mupaging

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.wind.mupaging.databinding.ListItemUserBinding

/**
 *
 *Created By wind
 *  on 12/2/20
 */
class UserAdapter :PagingDataAdapter<User,UserViewHolder>(UserDiffCallback()){
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
       val user=getItem(position)
        if (user!=null){
            holder.bind(user)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
       return UserViewHolder(ListItemUserBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

}


private class UserDiffCallback:DiffUtil.ItemCallback<User>(){
    override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
        return oldItem.uid == newItem.uid
    }

    override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
        return oldItem == newItem
    }

}