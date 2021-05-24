package com.example.practicaarquitectura.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle
import com.example.practicaarquitectura.R
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.Main) {
            delay(1000L)
            startActivity(Intent(this@MainActivity,HomeActivity::class.java))
        }

    }
}