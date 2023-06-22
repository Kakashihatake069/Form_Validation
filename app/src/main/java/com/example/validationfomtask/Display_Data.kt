package com.example.validationfomtask

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

import com.example.validationfomtask.databinding.DisplayDataBinding


class Display_Data : AppCompatActivity() {
    lateinit var binding: DisplayDataBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DisplayDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initview()
    }

    private fun initview() {


    }

}