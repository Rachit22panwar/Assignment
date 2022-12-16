package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class SignUp : AppCompatActivity() {

    lateinit var btn: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btn = findViewById(R.id.btn)

    }

    override fun onStart() {

        super.onStart()

        btn.setOnClickListener {
            var intent: Intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}