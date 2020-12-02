package com.wind.mupaging

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wind.mupaging.databinding.FragmentUsersBinding

/**
 *
 *Created By wind
 *  on 12/2/20
 */
class UsersFragment:Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding=FragmentUsersBinding.inflate(inflater,container,false)
        context?:return binding.root

        binding.rv.adapter


        return binding.root


    }

}