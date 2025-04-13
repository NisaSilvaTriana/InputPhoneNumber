package com.example.inputphonenumber

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etPhoneNumber: EditText
    private lateinit var btnSubmitPhone: Button
    private lateinit var tvPhoneResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        btnSubmitPhone = findViewById(R.id.btnSubmitPhone)
        tvPhoneResult = findViewById(R.id.tvPhoneResult)

        btnSubmitPhone.setOnClickListener {
            val phone = etPhoneNumber.text.toString().trim()
            if (phone.isNotEmpty() && phone.length >= 10 && phone.all { it.isDigit() }) {
                tvPhoneResult.text = "Nomor: $phone"
            } else {
                tvPhoneResult.text = "Nomor tidak valid!"
            }
        }
    }
}