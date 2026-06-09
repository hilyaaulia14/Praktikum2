package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan3)
        val bt_proses1 = findViewById<Button>(R.id.bt_proses1)
        val et_nama1 = findViewById<EditText>(R.id.et_nama1)

        bt_proses1.setOnClickListener {
            Toast.makeText(applicationContext,et_nama1.text, Toast.LENGTH_SHORT).show()
        }
    }
}