package com.wind.mupaging

import androidx.recyclerview.widget.RecyclerView
import com.wind.mupaging.databinding.ListItemUserBinding

/**
 *
 *Created By wind
 *  on 12/2/20
 */
class UserViewHolder(private val binding: ListItemUserBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(item: User) {
        binding.apply {
            user=item
            executePendingBindings()
        }

    }
}