package com.princepatel.comp304lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CreditDebitCardInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit_debit_card_info)
        supportActionBar?.hide()

        val _cardNumber: EditText = findViewById(R.id.cd_cardNumber)
        val _expiryDate: EditText = findViewById(R.id.cd_date)
        val _cvv: EditText = findViewById(R.id.cd_cvv)
        val _btnPay: Button = findViewById(R.id.cd_btnPay)

        _btnPay.setOnClickListener {
            val cardNumber = _cardNumber.text.toString()
            val expiryDate = _expiryDate.text.toString()
            val cvv = _cvv.text.toString()

            if(cardNumber.isEmpty() || expiryDate.isEmpty() || cvv.isEmpty()){
                Toast.makeText(this,"Please enter valid card details",Toast.LENGTH_SHORT).show()
            }
        }
    }
}