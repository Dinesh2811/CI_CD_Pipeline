package com.dinesh.android

import com.dinesh.android.v1.CalculatorLogic
import org.junit.Test
import org.junit.Assert.*

class CalculatorLogicUnitTest {

    @Test
    fun testCalculateResult() {
        val calculator = CalculatorLogic()
        val result = calculator.calculateResult(4, 6)
        assertEquals(10, result)
    }
}
