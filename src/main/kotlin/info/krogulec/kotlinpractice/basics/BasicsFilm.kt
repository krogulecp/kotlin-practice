package info.krogulec.kotlinpractice.basics

fun main() {
    val basicFilm = BasicsFilm("Rambo", 1984)
    basicFilm.addSequels(BasicsFilm("Rambo 2", 1990))
    println(basicFilm.sequels())
}

class BasicsFilm(val title: String, private val year: Int) {
    var available = true
    private var isPlaying = false
    private var sequels: MutableList<BasicsFilm> = mutableListOf()

    fun play() {
        if (available) {
            isPlaying = true
            println("playing $title")
        }
    }

    fun addSequels(vararg sequelsToAdd: BasicsFilm) {
        sequels.addAll(sequelsToAdd)
    }

    fun sequels(): List<BasicsFilm> {
        return sequels.toList()
    }

    override fun toString(): String {
        return title
    }
}
