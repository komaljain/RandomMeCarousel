package com.people.random.me.presentation.activities

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.people.random.me.presentation.R
import com.people.random.me.presentation.databinding.ActivityMainBinding

class MainActivity: Activity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main);
        binding.helloString.setText("this is hello world example")
    }
}