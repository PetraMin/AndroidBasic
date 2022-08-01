package com.line.androidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val a: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        a = a + 1
        printInfo(sum(1,2))
    }


    fun sum(a: Int, b: Int): Int{
        return a+b
    }

    fun sumAll(a:Int, b:Int, c:Int) = a+b+c


    fun printInfo(a:Int): Unit{
        print("sum = "+a)
    }

}