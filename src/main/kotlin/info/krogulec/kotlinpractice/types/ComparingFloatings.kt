package info.krogulec.kotlinpractice.types

fun main(){
    ComparingFloatings().compareNaNWithInfinity()
}

class ComparingFloatings {
    fun compareNaNWithInfinity(){
        val a = 1 / 0.0
        val b = 0 / 0.0
        println(a)
        println(b)

        println(a == b)
        println(a < b)
        println(a > b)
    }
}
