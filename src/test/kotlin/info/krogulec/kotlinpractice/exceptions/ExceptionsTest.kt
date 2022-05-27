package info.krogulec.kotlinpractice.exceptions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Collectors

internal class ExceptionsTest {

    @Test
    fun `should return all pesel numbers`(){
        //given
        val expected =
            Files.lines(Paths.get(javaClass.classLoader.getResource("pesel.txt").path)).collect(Collectors.toList()).sorted()

        //when
        val result = Exceptions().openFile().sorted()

        //then
        assertEquals(expected, result)
    }
}


