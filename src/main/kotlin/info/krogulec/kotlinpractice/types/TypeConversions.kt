package info.krogulec.kotlinpractice.types

fun main(){
    TypeConversions().convertIntToOther()
}

class TypeConversions {

    fun convertIntToOther(){
        val myInt = 500
        // do Long
        println("Integer: $myInt converted to Long is: ${myInt.toLong()}")

        // do Short
        // do Byte
        // do Double
        // do Float
    }
}
