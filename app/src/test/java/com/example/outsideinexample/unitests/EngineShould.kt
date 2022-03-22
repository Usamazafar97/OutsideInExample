package com.example.outsideinexample.unitests

import com.example.outsideinexample.Engine
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Test

class EngineShould{

    // engine object
    private val engine = Engine(false, 90.0)


    // This function will test the turnOn method.
    @Test
    fun turnsOn(){

        // calling the turnOn method.
        engine.turnOn()

        // assertTrue will check if the referenced method will return
        // the true.
        assertTrue(engine.isTurnOn)

    }

    @Test
    fun increaseTemperatureWhenEngineTurnsOn(){

        // calling the turnOn method
        engine.turnOn()

        // assertEquals check the both arguments  and if both are equal
        // then the test passes
        assertEquals(95.0, engine.temperature)

    }

}