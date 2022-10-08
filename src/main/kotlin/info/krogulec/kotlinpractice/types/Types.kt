package info.krogulec.kotlinpractice.types

fun main(){
}

class Types {

    fun createNumbers() {
        println("Creating int ${5}")
        println("Creating long ${5L}")

        val byteVal: Byte = 12
        println("Creating byte $byteVal")

        val shortVal: Short = 1000
        println("Creating short $shortVal")
    }

    fun createFloatings() {
        val doubleVal = 12.55
        println("Creating double $doubleVal")

        val floatVal = 1000.44f
        println("Creating float $floatVal")
    }

    fun createChars() {
        //TODO
    }

    fun createStrings() {
        val str = ""
        val anotherStr = "some msg $str"
        val multilineString = """
            line
            line
            line
            line
            line
            line
            line
            line
            line
        """.trimIndent()
    }

    fun createArrays() {
        val myArr = arrayOf(1)
        val list = listOf("")
    }
}
