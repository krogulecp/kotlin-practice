package info.krogulec.kotlinpractice.loops

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ForLoopIterateTest{

    @Test
    fun `should return correct numbers`(){
        assertEquals(listOf(10,8,6,4,2,0), ForLoopIterate().returnAllNumbersFromMaxToMinWithStep2(10,0))
        assertEquals(listOf(11,9,7,5,3,1), ForLoopIterate().returnAllNumbersFromMaxToMinWithStep2(11,0))
    }
}
