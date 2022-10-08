package info.krogulec.kotlinpractice.types

fun main(){
    val firstValue = OperatorsOverloading(10)
    val secondValue = OperatorsOverloading(15)
    println(firstValue + secondValue)
}

class OperatorsOverloading(private val value: Int) {
    operator fun plus(toAdd: OperatorsOverloading): OperatorsOverloading {
        return OperatorsOverloading(value + toAdd.value)
    }

    override fun toString(): String {
        return "OperatorsOverloading(value=$value)"
    }
}
