package com.example.outsideinexample.acceptancetests

import com.example.outsideinexample.Car
import com.example.outsideinexample.Engine
import com.example.outsideintddexample.acceptancetests.MainCoroutineScopeRule
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class CarFeature {

    // engine object with temperature anf turnOn boolean
    private val engine = Engine(false,90.0)

    // car object with fuel and engine object
    private val car = Car(6.0,engine)

    @get: Rule
    var coroutineTestRule = MainCoroutineScopeRule()

    @Test
    fun carLoseFuelWhenTurnedOn() = runBlockingTest {

        // car is turned on
        car.turnOn()

        // advance the time by 6 seconds
        //coroutineTestRule.advanceTimeBy(6001)

        // assertEquals check both of the arguments
        // 1st and 2nd arguments to compare, 3rd argument is delta, is the
        // acceptable difference of value
        assertEquals(5.5,car.fuel,0.0)

    }

    @Test
    fun carTemperatureIncreasesWhenEngineTurnOn() = runBlockingTest {

        // engine of the car object is turned on
        car.engine.turnOn()

        // assertEquals check both of the arguments
        // 1st and 2nd arguments to compare, 3rd argument is delta, is the
        // acceptable difference of value
        assertEquals(95.0,car.engine.temperature,0.0)

    }
}