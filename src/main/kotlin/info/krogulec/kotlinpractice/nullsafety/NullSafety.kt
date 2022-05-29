package info.krogulec.kotlinpractice.nullsafety

import java.util.Random

class NullSafety(private val random: Random = Random()) {

    fun prepareRandomDrink(): Drink{
        TODO()
    }

    private fun makeDrink(drinkName: String): Drink {
        return Drink(drinkName)
    }

    private fun pickValue(): String? {
        return listOf("coffee", "tea", "juice").getOrNull(random.nextInt(10))
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
