package info.krogulec.kotlinpractice.loops

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WhileLoopIterateTest{

    @Test
    fun `should return all results`(){
        val results = WhileLoopIterate().returnAllResultsInSingleList("cat")
        assertEquals(listOf("cat0", "cat0", "cat1", "cat1", "cat2","cat2", "cat3", "cat3", "cat4", "cat4"), results)
    }
}

