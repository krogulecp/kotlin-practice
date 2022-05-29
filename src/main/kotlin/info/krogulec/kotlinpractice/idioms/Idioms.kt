package info.krogulec.kotlinpractice.idioms

fun main() {
    val isRectangle = Idioms().checkIfValueIsInstanceOfRectangle(Square())
    println(isRectangle)

    Idioms().swapTwoVariables()
}

class Idioms {

    fun findValuesGreaterThanGivenNumber(numbers: List<Int>, number: Int): List<Int> {
        return numbers.filter { it > number }
    }

    fun checkIfElementIsInCollection(numbers: List<Int>, number: Int): Boolean {
        return number in numbers
    }

    fun checkIfValueIsInstanceOfRectangle(obj: Any): Boolean {
        return obj is Rectangle
    }

    fun prepareList(a: String, b: String, c: String): List<String> {
        // nie można w kotlinie tworzyć listy, gdzie nie wskażemy typu wartości przechowywanych
        val someList = listOf<String>()

        return listOf(a, b, c)
    }

    fun prepareListFromVararg(vararg elements: String): List<String> {
        return elements.toList()
    }

    fun prepareMap(key1: Int, value1: String, key2: Int, value2: String): Map<Int, String> {
        return mapOf(
            key1 to value1,
            key2 to value2,
        )
    }

    fun prepareSingleton() {
        //prepare java singleton in class Singleton
        TODO()
    }

    fun executeCodeIfValueIsNotNull(value: String?) {
        value?.let { println(it.length) } ?: println("value is null")
    }

    fun swapTwoVariables() {
        var a = 1
        var b = 2
        a = b.also { b = a }
        println("a is $a and b is $b")
    }
}

open class Rectangle(val x: Int, val y: Int)

class Square : Rectangle(1, 2)
