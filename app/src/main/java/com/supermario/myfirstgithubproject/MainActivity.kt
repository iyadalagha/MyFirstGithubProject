package com.supermario.myfirstgithubproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var s = Student("Ahmed")
        Log.d("tt","Hello")
        Log.d("tt","Hi")
    }
}