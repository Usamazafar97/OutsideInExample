package com.example.outsideinexample.unitests

import com.example.outsideinexample.Car
import com.example.outsideinexample.Engine
import com.example.outsideintddexample.acceptancetests.MainCoroutineScopeRule
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test


// CarShould name is suggested for the methods
class CarShould {

    // mocked Engine object just created for the car class
    private val engine : Engine = mock()

    // Car object also take engine object
    private val car = Car(9.0,engine)


    @get: Rule
    var coroutineTestRule = MainCoroutineScopeRule()

    // This method test the car object with
    // the fuel lost by 0.5 litres when car is tuned on
    @Test
    fun loseFuelWhenTurnedOn() = runBlockingTest{

        // method is called
        car.turnOn()

        // assertEquals check both or the parameters are equal
        // or not, if they are equal test passes,
        // the 3rd argument is the delta ( difference between the
        // expected and the original values )
        assertEquals(8.5, car.fuel,0.0)
    }

    // This method test the engine object, with the
    @Test
    fun turnOnItsEngine() = runBlockingTest{

        // method is called
        car.turnOn()

        // check if a certain method of a mock object has been
        // called by specific number of times.
        verify(engine, times(1)).turnOn()
    }

}