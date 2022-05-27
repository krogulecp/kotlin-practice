package info.krogulec.kotlinpractice.types

fun main(){
    ComparingInts().compareSmallIntsReferences()
    ComparingInts().compareBiggerIntsReferences()
    ComparingInts().compareBoxedIntsValues()
}

class ComparingInts {
    fun compareSmallIntsReferences(){
        val a = 100
        val boxed: Int? = a
        val otherBoxed: Int? = a
        println("Compare small ints ${boxed === otherBoxed}")
    }

    fun compareBiggerIntsReferences(){
        //TODO
    }

    fun compareBoxedIntsValues(){
        //TODO
    }
}
