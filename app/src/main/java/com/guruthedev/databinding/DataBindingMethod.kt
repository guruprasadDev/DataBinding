package com.guruthedev.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.guruthedev.databinding.databinding.ActivityBindingAdapterMethodBinding

class DataBindingMethod : AppCompatActivity() {
    private lateinit var binding: ActivityBindingAdapterMethodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_binding_adapter_method)

        val data = DataModel(
            "Guru Prasad",
        "Android Developer",
        "https://ca.slack-edge.com/T02TLUWLZ-U040DBX2XUG-0a35a4f5f560-192",
            12
        )
        binding.dataModel = data
    }
}