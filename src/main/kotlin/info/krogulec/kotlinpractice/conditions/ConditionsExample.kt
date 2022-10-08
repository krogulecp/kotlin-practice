package info.krogulec.kotlinpractice.conditions

class ConditionsExample {

    fun someFunc(): Int {
        val a = 10
        return if (a > 5) 10 else 20
    }

    fun someOtherFunc() {
        val a = 10
        val result = when (a) {
            in 1..20 -> println("is in 1..20")
            else -> println("not in range")
        }


    }
}
