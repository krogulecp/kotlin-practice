package info.krogulec.kotlinpractice.collections

fun main() {
    CreatingCollections().iterateOverLists()
}

class CreatingCollections {

    // PRZYKŁAD 1
    fun nullsInCollection() {
        val list = listOf<String?>(null, null, null, null)
        println("nulls in list $list")

        val set = setOf<String?>(null, null, null, null)
        println("nulls in set $set")

        val map = mapOf<String?, String>(
            null to "1",
            null to "2",
            null to "3",
        )
        println("nulls in map $map")

        val listInterfered = listOf(1, 2, 3L)
    }

    // PRZYKŁAD 2
    fun mutatingInCopiedList() {
        var rambo = Film("Rambo", 1982)
        val firstList = listOf(rambo)
        val copiedList = firstList.toList()
        println("first list: $firstList -- copied list: $copiedList")
        rambo.title = "Rambo2"
        println("first list: $firstList -- copied list: $copiedList")

        val mutable = mutableListOf<Int>().toList()
    }

    //PRZYKŁAD 3
    fun addingObjects(){
        val sourceList = mutableListOf(1, 2, 3)
        val referenceList = sourceList
        referenceList.add(4)
        println("Source size: ${sourceList.size}")
    }

    //PRZYKŁAD 4
    fun iterateOverLists() {
        val ints = listOf(1, 2, 3, 4, 5, 6, 7)
        var iterator = ints.listIterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
        while (iterator.hasPrevious()) {
            println(iterator.previous())
        }
    }

    //PRZYKŁAD 5
    fun mutableIterators(){
        TODO()
    }

    // ZADANIE 1
    fun removeOldFilms(): List<Film> {
        val mutableFilms = films.toMutableList()
        val iterator = mutableFilms.listIterator()
        while (iterator.hasNext()) {
            val film = iterator.next()
            if (film.year < 1990) {
                iterator.remove()
            }
        }
        return mutableFilms
    }

    // ZADANIE 2
    fun checkIfFilmIsFromNineties(film: Film): Boolean{
        TODO()
    }

    // ZADANIE 3
    fun buildMapFromFilmsRaw(): Map<String, Int>{
        TODO("use filmsRaw")
    }

    // ZADANIE 4
    fun joinAllRawFilms(): String{
        TODO("use filmsRaw")
    }

    // ZADANIE 5
    fun filterFilms(): List<Film>{
        TODO("use films")
    }

    // ZADANIE 6
    fun anyFilmAfterGivenYear(year: Int): Boolean{
        TODO("use films")
    }

    //PRZYKŁAD 6
    fun chunkedAndWindowedDiff(){
        TODO()
    }

    // ZADANIE 6
    fun sortFilms(): List<Film>{
        TODO("use films")
    }

    companion object {
        private val films = listOf(
            Film("Rambo", 1982),
            Film("The Green Mile", 1999),
            Film("The Matrix", 1999),
            Film("Pulp Fiction", 1994),
            Film("The Godfather", 1972)
        )

        private val filmsRaw = listOf(
            "Rambo - 1982",
            "The Green Mile - 1999",
            "The Matrix - 1999",
            "Pulp Fiction - 1994",
            "The Godfather - 1972",
        )
    }

}

data class Film(var title: String, var year: Int)
