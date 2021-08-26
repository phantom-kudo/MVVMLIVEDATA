package com.phantomlabs.mvvmlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.phantomlabs.mvvmlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dataBinding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

//        mainViewModel.quoteLiveData.observe(this, {
//            dataBinding.quotetext.text = it
//        })

        dataBinding.mainViewModel = mainViewModel
        dataBinding.lifecycleOwner = this

//        dataBinding.updatebtn.setOnClickListener {
//            mainViewModel.updateQuote()
//        }


    }
}