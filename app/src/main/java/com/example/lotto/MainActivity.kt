package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var num = IntArray(6)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<ImageView>(R.id.RBTN)
        btn.setOnClickListener{
            for(i in 0..5){
                random(i)
            }
            findViewById<TextView>(R.id.RTV_1).text = num[0].toString()
            findViewById<TextView>(R.id.RTV_2).text = num[1].toString()
            findViewById<TextView>(R.id.RTV_3).text = num[2].toString()
            findViewById<TextView>(R.id.RTV_4).text = num[3].toString()
            findViewById<TextView>(R.id.RTV_5).text = num[4].toString()
            findViewById<TextView>(R.id.RTV_6).text = num[5].toString()
        }
    }
    fun random(cnt : Int){
        val Rnum : Int
        var A = 0
        Rnum = Random().nextInt(45) + 1
        for(i in 0..cnt){
            if(num[i] == Rnum){
                A++
                break
            }
        }
        if(A==0){
            num[cnt] = Rnum
        }
        else{
            random(cnt)
        }
    }
}