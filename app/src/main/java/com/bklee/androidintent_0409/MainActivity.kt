package com.bklee.androidintent_0409

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
    }

    fun setupEvents() {
        dialBtn.setOnClickListener {

            //            입력한 번호로 전화를 걸도록 직접 코드 수정.
            val inputPhoneNum = phoneNumEdt.text.toString()

//            어느 화면으로 갈지 직접 명시. => Uri를 이용해서 명시.
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

        callBtn.setOnClickListener {

            //            입력한 번호로 전화를 걸도록 직접 코드 수정.
            val inputPhoneNum = phoneNumEdt.text.toString()

//            어느 화면으로 갈지 직접 명시. => Uri를 이용해서 명시.
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)
        }

        smsBtn.setOnClickListener {
            //            입력한 번호로 전화를 걸도록 직접 코드 수정.
            val inputPhoneNum = phoneNumEdt.text.toString()

//            어느 화면으로 갈지 직접 명시. => Uri를 이용해서 명시.
            val myUri = Uri.parse("smsto:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_SENDTO, myUri)
            myIntent.putExtra("sms_body", "자동 입력 내용")
            startActivity(myIntent)
        }

    }

}
