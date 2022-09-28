package com.guruthedev.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.guruthedev.databinding.databinding.ActivityDataBindingExampleBinding

class DataBindingExample : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_data_binding_example)
        binding.employee=getEmployee()
    }
    private fun getEmployee(): Employee{
        return Employee("202","Guru Prasad Reddy","guruprasad@gmail.com")
    }
}