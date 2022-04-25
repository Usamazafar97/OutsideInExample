package com.example.outsideinexample.unitests

import com.example.outsideinexample.Engine
import com.example.outsideintddexample.acceptancetests.MainCoroutineScopeRule
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test

class EngineShould{

    // engine object
    private val engine = Engine(false, 90.0)


    @get: Rule
    var coroutineTestRule = MainCoroutineScopeRule()

    // This function will test the turnOn method.
    @Test
    fun turnsOn() = runBlockingTest{

        // calling the turnOn method.
        engine.turnOn()

        // assertTrue will check if the referenced method will return
        // the true.
        assertTrue(engine.isTurnOn)
    }

    @Test
    fun increaseTemperatureWhenEngineTurnsOn() = runBlockingTest{

        // calling the turnOn method
        engine.turnOn()

        // assertEquals check the both arguments  and if both are equal
        // then the test passes
        assertEquals(95.0, engine.temperature)

    }

}