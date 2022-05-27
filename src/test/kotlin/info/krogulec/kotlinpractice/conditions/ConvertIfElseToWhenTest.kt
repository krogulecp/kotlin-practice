package info.krogulec.kotlinpractice.conditions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class ConvertIfElseToWhenTest {

    @ParameterizedTest
    @CsvSource(value = [
        "Poland, PLN",
        "France, EUR",
        "Italy, EUR",
        "USA, USD",
        "Spain, UNKNOWN",
    ])
    fun `should return correct currency`(country: String, currency: String) {
        assertEquals(currency, ConvertIfElseToWhen().getCurrency(country))
    }
}
