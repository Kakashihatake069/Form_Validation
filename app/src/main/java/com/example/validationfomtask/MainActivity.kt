package com.example.validationfomtask

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.validationfomtask.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.imgSubmit.setOnClickListener(View.OnClickListener { // store the returned value of the dedicated function which checks
            // whether the entered data is valid or if any fields are left blank.
         val isAllFieldsChecked = initview()

            // the boolean variable turns to be true then
            // only the user must be proceed to the activity2
            if (isAllFieldsChecked) {
                val i = Intent(this@MainActivity, Display_Data::class.java)
                startActivity(i)
            }
        })

        initview()

    }

    private fun initview() : Boolean {




//            val FirstName = mainBinding.edtFirstname.text.toString()
//            val LastName = mainBinding.edtLastName.text.toString()
//            val UserName = mainBinding.edtusername.text.toString()
//            val Email = mainBinding.edtEmailid.text.toString()
//            val Password = mainBinding.edtPassword.text.toString()
//            val phone = mainBinding.edtcall.text.toString()
//            val gender = mainBinding.edtgender.text.toString()
//            val DoB = mainBinding.edtage.text.toString()
//
//            if (FirstName.isEmpty()) {
//                Toast.makeText(this, "First Name is required", Toast.LENGTH_SHORT).show()
//            } else if (LastName.isEmpty()) {
//                Toast.makeText(this, "Last Name is required", Toast.LENGTH_SHORT).show()
//
//            } else if (UserName.isEmpty()) {
//                Toast.makeText(this, "Username is required", Toast.LENGTH_SHORT).show()
//            } else if (Email.isEmpty()) {
//                Toast.makeText(this, "Email id is required", Toast.LENGTH_SHORT).show()
//            } else if (Password.isEmpty()) {
//                Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show()
//
//            } else if (Password.length < 8) {
//                Toast.makeText(this, "Password must be minimum 8 characters", Toast.LENGTH_SHORT)
//                    .show()
//            }else if (phone.isEmpty()){
//                Toast.makeText(this, "Phone number is required", Toast.LENGTH_SHORT).show()
//            }else if (gender.isEmpty()){
//                Toast.makeText(this, "Gender is required", Toast.LENGTH_SHORT).show()
//            }else if(DoB.isEmpty()){
//                Toast.makeText(this, "Date of Birth is required", Toast.LENGTH_SHORT).show()
//            }
            // after all validation return true.


        if ( mainBinding.edtFirstname.length() == 0) {
            mainBinding.edtFirstname.error = "This field is required"
            return false
        }
        if (mainBinding.edtLastName.length() == 0) {
            mainBinding.edtLastName.error = "This field is required"
            return false
        }
        if (mainBinding.edtEmailid.length() == 0) {
            mainBinding.edtEmailid.error = "Email is required"
            return false
        }
        if (mainBinding.edtusername.length() == 0) {
            mainBinding.edtusername.error = "Username is required"
            return false
        }
        if (mainBinding.edtPassword.length() == 0) {
            mainBinding.edtPassword.error = "Password is required"
            return false
        } else if (mainBinding.edtPassword.length() < 8) {
            mainBinding.edtPassword.error = "Password must be minimum 8 characters"
            return false
        }
        if (mainBinding.edtcall.length() == 0) {
            mainBinding.edtcall.error = "Phone number is required"
            return false
        }
        if (mainBinding.edtgender.length() == 0) {
            mainBinding.edtgender.error = "Gender is required"
            return false
        }
        if (mainBinding.edtage.length() == 0) {
            mainBinding.edtage.error = "age is required"
            return false
        }
        // after all validation return true.
        return true
            Log.e("TAG", "CheckAllFields: " +mainBinding.edtFirstname+" "+mainBinding.edtPassword)
        }

}