package info.krogulec.kotlinpractice.basics

fun main(args: Array<String>) {
//    println("Hello kotlin ${args.firstOrNull()}")
//    someMethodOutsideClass(1, 2)
    defaultParams(secondParam = 5, firstParam = 2)
    myVariable = ""
    BasicsExample()
    BasicsExample("", 3)
}

fun someMethodOutsideClass(firstParam: Int, secondParam: Int) = firstParam + secondParam

fun otherMethodOutsideClass(firstParam: Int, secondParam: Int): Int {
    return firstParam + secondParam
}

fun defaultParams(firstParam: Int, secondParam: Int = 0) {
    println("${firstParam.rangeTo(45)} i $secondParam")
}

internal fun varargParams(vararg myParam: String) {
    println(myParam.first())
}

val myValue = ""
var myVariable = ""

// comment
/*

 */
/**
 *
 */
open class BasicsExample(
    private val myParam: String = "defaultValue",
    private val mySecondParam: Int,
) {
    constructor() : this("", 3) {

    }
}

class BasicsExampleChild : BasicsExample() {

}
