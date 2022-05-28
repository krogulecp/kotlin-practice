package info.krogulec.kotlinpractice.types

fun main(){
    Types().createStrings()
}

class Types {

    fun createInts() {
        val a: Long = 200

        println(a.javaClass.simpleName)
    }

    fun createFloatings() {
        val d = 10.55f

        println(d.javaClass.simpleName)
    }

    fun createChars() {
        println('U')
    }

    fun createStrings() {
        val str = "jakaś wartość"
        val rawString = """
            tutaj wrzucamy całe teksty
            jeśli jest taka potrzeba. Możemy dodawać ""
            $str
        """.trimIndent()

        println(rawString)
    }

    fun createArrays() {
        val arr = arrayOf(1, 2, 3)
    }
}
