package com.wind.mupaging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.wind.mupaging.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        initSwipeToRefresh()
    }

    private fun initSwipeToRefresh() {


        binding.layoutSwipeRefresh.setOnRefreshListener {

        }
    }
}