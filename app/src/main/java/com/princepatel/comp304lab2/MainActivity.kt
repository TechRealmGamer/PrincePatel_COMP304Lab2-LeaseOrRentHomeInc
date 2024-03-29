package com.princepatel.comp304lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "LeaseOrRentHome Inc."

        /////////////
        val btnEnter: Button = findViewById(R.id.main_btn_Enter)

        btnEnter.setOnClickListener {
            View.OnClickListener { //val intent = Intent(this@MainActivity, <ClassName>::class.java);
                startActivity(intent);
            }
        }
    }
}