package com.example.outsideinexample

import android.util.Log
import kotlinx.coroutines.delay

// Engine class to test
class Engine (var isTurnOn: Boolean, var temperature: Double){

    // turnOn method increases the temperature by 5 degree
    suspend fun turnOn(){

        // halting the main thread for 3 seconds
        delay(3000)

        Log.d("Testing","After 3 minutes, this runs")

        // boolean changes to true
        isTurnOn = true

        // temperature increases by 5 degrees
        temperature += 5.0

    }

}