package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan4)

        val bt_proses2 = findViewById<Button>(R.id.bt_proses2)
        val et_nama2 = findViewById<EditText>(R.id.et_nama2)
        val etm_hasil = findViewById<EditText>(R.id.etm_hasil)

        bt_proses2.setOnClickListener {
            val strValue: String = et_nama2.getText().toString()
            etm_hasil.append(strValue+ "\n")
        }
    }
}