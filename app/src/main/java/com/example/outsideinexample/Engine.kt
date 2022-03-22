package com.example.outsideinexample

// Engine class to test
class Engine (var isTurnOn: Boolean, var temperature: Double){

    // turnOn method increases the temperature by 5 degree
    fun turnOn(){

        // boolean changes to true
        isTurnOn = true

        // temperature increases by 5 degrees
        temperature += 5.0

    }

}