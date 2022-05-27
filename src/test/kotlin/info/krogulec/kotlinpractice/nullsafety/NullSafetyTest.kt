package info.krogulec.kotlinpractice.nullsafety

import org.junit.jupiter.api.RepeatedTest

internal class NullSafetyTest {

    @RepeatedTest(10)
    fun `should make random drink`(){
        //when
        val randomDrink = NullSafety().prepareRandomDrink()

        //then
        val hasOneOfExpectedValues = randomDrink.drinkName in listOf("coffee", "tea", "juice", "water")
        assert(hasOneOfExpectedValues)
    }
}
