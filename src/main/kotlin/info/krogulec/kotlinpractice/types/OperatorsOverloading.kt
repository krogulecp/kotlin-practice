package info.krogulec.kotlinpractice.types

fun main(){
    val firstValue = OperatorsOverloading(10)
    val secondValue = OperatorsOverloading(5)
    val sum = firstValue + secondValue

    println(sum.value)
}

class OperatorsOverloading(val value: Int) {
    operator fun plus(toAdd: OperatorsOverloading): OperatorsOverloading {
        return OperatorsOverloading(toAdd.value + this.value)
    }
}
