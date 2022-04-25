package com.example.outsideinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val engine = Engine(false, 97.0)
        //println(engine.turnOn())

        CoroutineScope(Dispatchers.Main).launch {
            engine.turnOn()
        }




    }
}