package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    lateinit var txthello:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txthello=findViewById(R.id.txthello)
        var intent=getIntent()
        var username:String = intent.getStringExtra("edtuser").toString()
        var password:String = intent.getStringExtra("edtpass").toString()

        txthello.setText("Hello $username")
    }
}