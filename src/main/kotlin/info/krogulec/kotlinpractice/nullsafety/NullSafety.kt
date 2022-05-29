package info.krogulec.kotlinpractice.nullsafety

import java.util.Random

class NullSafety(private val random: Random = Random()) {

    fun prepareRandomDrink(): Drink{
        val drinkName = pickValue() ?: DEFAULT_DRINK_NAME
        return makeDrink(drinkName)
    }

    private fun makeDrink(drinkName: String): Drink {
        return Drink(drinkName)
    }

    private fun pickValue(): String? {
        return listOf("coffee", "tea", "juice").getOrNull(random.nextInt(10))
    }

    companion object {
        private const val DEFAULT_DRINK_NAME = "water"
    }
}

data class Drink(val drinkName: String)


class NullSafetyExample {

    fun test(value: String?): String {
        return value ?: handleNullValue()
    }

    fun handleNullValue(): String {
        // możemy coś zalogować lub wykonać inny kod
        return ""
    }
}
