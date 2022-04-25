package com.example.outsideinexample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// Car class to test
class Car(var fuel: Double, val engine:Engine) {

    // turnOn method reduce the fuel by  0.5 litres
    fun turnOn(){

        // fuel reduced by 0.5 litres
        fuel -= 0.5

        // if the car starts, then the engine must turnOn

        CoroutineScope(Dispatchers.IO).launch {
            engine.turnOn()
        }
    }

}