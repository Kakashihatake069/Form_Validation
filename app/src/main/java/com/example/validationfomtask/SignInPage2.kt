package com.example.validationfomtask

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.validationfomtask.databinding.ActivitySignInPage2Binding
import com.google.android.material.datepicker.MaterialDatePicker.Builder.datePicker
import java.util.Calendar


class SignInPage2 : AppCompatActivity() {
    lateinit var binding: ActivitySignInPage2Binding
    var radioGroup: RadioGroup? = null
    lateinit var gender: String
    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        initview()
    }

    private fun initview(){

        binding.imgSubmit2.setOnClickListener {
            val id: Int = binding.radiogrp.getCheckedRadioButtonId()
            val rb = findViewById<RadioButton>(id)
            if (id != -1) {
                gender = rb.text.toString()
            }
        }

        binding.imgnext2.setOnClickListener {
            var intent = Intent(this@SignInPage2,SignInPage3::class.java)
            startActivity(intent)
        }


    }

}