package info.krogulec.kotlinpractice.basics

fun main(args: Array<String>) {
}

open class BasicsFilm(val title: String, private val year: Int) {
    var available: Boolean = true
    private var isPlaying: Boolean = false
    private val sequels: MutableList<BasicsFilm> = mutableListOf()

    fun play() {
        if (available) {
            isPlaying = true
            println("playing $title")
        }
    }

    fun addSequels(vararg sequelsToAdd: BasicsFilm) {
        sequels.addAll(sequelsToAdd)
    }
}

class BasicsExample(
    private val ctorParam: Int,
    val ctorParam2: String,
    var ctorParam3: List<String>
) {

    // to jest komentarz
    fun test(param1: String, param2: Int = 3) =
        listOf("one", "two", "three")
            .filter { it.length == 1 }
            .map { it.length }

    /*
    *
    * */
    fun test(param1: String) {
        val testVariable = "testVariable"
        var testVarVariable = ""

        println("test ${param1.length} with one param")
    }

    /**
     *
     */
    fun testManyParams(param1: String, param2: String, param3: String, param4: String, param5: String) {
        fun nested() = ""
        nested()
    }

    fun varargsTest(vararg someParams: String, param1: String) {

    }

    fun test2() {
        test(param1 = "str")

        //możemy nazywać parametry
        testManyParams(
            param1 = "1",
            param2 = "2",
            param3 = "3",
            param4 = "4",
            param5 = "5"
        )

        varargsTest("", "", param1 = "")
    }

}
