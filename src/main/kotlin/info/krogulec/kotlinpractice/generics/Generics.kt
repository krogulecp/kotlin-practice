package info.krogulec.kotlinpractice.generics

class Generics {
    fun test(sample: Sample<String>) {
        //val generalised: Sample<Any> = sample
    }
}

class Sample<T> {
    fun compareTo(comparable: Comparable<Number>) {
        comparable.compareTo(1.0)
        val y: Comparable<Double> = comparable
    }
}

interface Comparable<in T> {
    fun compareTo(other: T): Int
}
