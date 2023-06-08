package com.example.validationfomtask

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.validationfomtask.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

       initview()

    }

    private fun initview() {


        mainBinding.imgSubmit.setOnClickListener {



            var  isAllFieldsChecked = CheckAllFields()

            if (isAllFieldsChecked){
                val i = Intent(this@MainActivity, SignInPage2::class.java)
                startActivity(i)
            }

        }





    }

    private fun CheckAllFields(): Boolean {

        val FirstName = mainBinding.edtFirstname.text.toString()
        val LastName = mainBinding.edtLastName.text.toString()
        val UserName = mainBinding.edtusername.text.toString()
        val Email = mainBinding.edtEmailid.text.toString()
        val Password = mainBinding.edtPassword.text.toString()

        if (FirstName.length == 0) {
            mainBinding.edtFirstname.setError("This field is required")
            return false
        }
        if (LastName.length == 0) {
            mainBinding.edtLastName.setError("This field is required")
            return false
        }
        if (UserName.length == 0) {
            mainBinding.edtusername.setError("Email is required")
            return false
        }
        if (Email.length == 0) {
            mainBinding.edtEmailid.setError("Password is required")
            return false
        } else if (Password.length < 8) {
            mainBinding.edtPassword.setError("Password must be minimum 8 characters")
            return false
        }

        // after all validation return true.
        return true
    }
}