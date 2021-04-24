package com.example.heeloandroid.library

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Class1Homework {
    @Test
    fun `Task 1 - Print sentences`() {
        /*
        Print below sentences

        HelloAndroid!
        I like summer
         */
        var output: String = "HelloAndroid!\nI like summer"
        assertEquals(task1Answer(), output)
    }

    @Test
    fun `Task 2 - Combine strings`() {
        /*
        Using below 5 variables, print "I like chicken pasta and chicken curry."
         */
        var input1 = "chicken "
        var input2 = "and "
        var input3 = "curry."
        var input4 = "pasta "
        var input5 = "I like "
    }

    @Test
    fun `Task 3 - String replace`() {
        /*
        Using below 5 variables, print "I like chicken pasta and chicken curry."
         */
        var input = "I hvad ppapp great davpy"
    }
}