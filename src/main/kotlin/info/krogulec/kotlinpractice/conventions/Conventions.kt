package info.krogulec.kotlinpractice.conventions

class Conventions(
    val param1: String,
    val param2: String,
    val param3: String? = null,
    val param4: List<Int> = emptyList(),
) {
    val someProp = ""
    fun someFun() = ""

    fun test(
        param1: String,
        param2: String,
        param3: String,
        param4: List<Int> = emptyList(),
    ) {

        Conventions(
            param1 = "",
            param2 = "",
        )

        println("print something $param1")
    }

    fun doSth() {
        test(
            "", "", // powiązane tematycznie parametry w jednej linii
            "", emptyList(),
        )
        val otherList = listOf(1, 2, 3, 4, 5)

        listOf("param1", "param2")
            .filter { it.length > 2 }
            .map {
                val length = it.length
                otherList.filter { num -> num == length }
            }
            .takeLast(1)
    }

}
