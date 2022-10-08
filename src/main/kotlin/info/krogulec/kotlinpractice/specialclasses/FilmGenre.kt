package info.krogulec.kotlinpractice.specialclasses

enum class FilmGenre : Playable {
    COMEDY,
    HORROR,
    THRILLER,
    ANIME;

    override fun play() {
        println("Playing $name")
    }
}

interface Playable {
    fun play()
}



