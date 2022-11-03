package com.example.testshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testshop.screen_main.select_category

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.placeHolder, select_category.newInstance()).commit()
    }
}