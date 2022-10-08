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
        println("Integer: $myInt converted to Short is: ${myInt.toShort()}")

        // do Byte
        println("Integer: $myInt converted to Byte is: ${myInt.toByte()}")

        // do Double
        println("Integer: $myInt converted to Double is: ${myInt.toDouble()}")

        // do Float
        println("Integer: $myInt converted to Float is: ${myInt.toFloat()}")

    }
}
