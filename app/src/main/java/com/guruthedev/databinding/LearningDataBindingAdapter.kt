package com.guruthedev.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.guruthedev.databinding.databinding.ActivityLearningDataBindingAdapterBinding

class LearningDataBindingAdapter : AppCompatActivity() {
    private lateinit var binding : ActivityLearningDataBindingAdapterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_learning_data_binding_adapter)

        val viewModel = ViewModelProvider(this).get(LearningDataBindingAdapterViewModel::class.java)
        binding.bindingViewModel = viewModel
        binding.lifecycleOwner = this
    }
}