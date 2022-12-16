package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class HomeActivity : AppCompatActivity() {

    lateinit var txtSingup:TextView
    lateinit var btn:AppCompatButton
    lateinit var edtuser:TextView
    lateinit var edtpass:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        txtSingup = findViewById(R.id.txtSignup)
        btn = findViewById(R.id.btn)
        edtuser = findViewById(R.id.edtUser)
        edtpass = findViewById(R.id.edtPass)

    }

    override fun onStart() {

        super.onStart()

        txtSingup.setOnClickListener{
            var intent : Intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
        btn.setOnClickListener{
            var user:String = edtuser.text.toString()
            var password = edtpass.text.toString()
            var intent: Intent = Intent(this,login::class.java)
            intent.putExtra("edtuser",user)
            intent.putExtra("edtpass",password)
            startActivity(intent)
        }

    }
}