package com.princepatel.comp304lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class PaymentOptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_options)
        supportActionBar?.hide()

        val paymentOptions: RadioGroup = findViewById(R.id.payment_options)
        val btnContinue: Button = findViewById(R.id.payment_continue)

        btnContinue.setOnClickListener {
            if(paymentOptions.checkedRadioButtonId == R.id.payment_credit ||
                paymentOptions.checkedRadioButtonId == R.id.payment_debit) {
                val intent = Intent(this@PaymentOptions, CreditDebitCardInfo::class.java)
                startActivity(intent)
            }
        }

    }
}