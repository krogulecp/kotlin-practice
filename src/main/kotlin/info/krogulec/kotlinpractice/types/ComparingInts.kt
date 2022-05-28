package info.krogulec.kotlinpractice.types

fun main(){
    ComparingInts().compareSmallIntsReferences()
    ComparingInts().compareBiggerIntsReferences()
    ComparingInts().compareBoxedIntsValues()
}

class ComparingInts {

    // porównanie referencji w określonych przypadkach (-127 do 128) daje wartość true
    fun compareSmallIntsReferences() {
        val a: Int = 100
        val boxed: Int? = a
        val otherBoxed: Int? = a
        println("Compare small ints ${boxed === otherBoxed}")
    }

    // w pozostałych przypadkach mamy false
    fun compareBiggerIntsReferences() {
        val a: Int = 1000
        val boxed: Int? = a
        val otherBoxed: Int? = a
        println("Compare small ints ${boxed === otherBoxed}")
    }

    // porównanie wartości zawsze daje true
    fun compareBoxedIntsValues() {
        val a: Int = 1000
        val boxed: Int? = a
        val otherBoxed: Int? = a
        println("Compare small ints ${boxed == otherBoxed}")
    }
}
