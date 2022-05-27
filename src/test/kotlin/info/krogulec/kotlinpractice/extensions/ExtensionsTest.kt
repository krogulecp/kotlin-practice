package info.krogulec.kotlinpractice.extensions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class ExtensionsTest{

    @ParameterizedTest
    @CsvSource(value = [
        "kawa, 1, lbxb",
        "placek, 2, rncegm",
    ])
    fun testExtensions(input: String, shift: Int, output: String){

        val encodeResult = input.encodeWithCesarCipher(shift)

        assertEquals(encodeResult, output)
    }
}
