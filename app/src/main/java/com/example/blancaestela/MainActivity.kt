package com.example.blancaestela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Lifecycle","OnCreate")
        val greetingText = findViewById<TextView>(R.id.txt_output)
        val actionButton = findViewById<Button>(R.id.btn_accion)
        actionButton.setOnClickListener{
            greetingText.text ="Welcome"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle","OnPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle","OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle","OnDestroy")
    }
}