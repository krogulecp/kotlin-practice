package info.krogulec.kotlinpractice.collections

class CreatingCollections {

    // PRZYKŁAD 1
    fun nullsInCollection(){
        TODO()
    }

    // PRZYKŁAD 2
    fun mutatingInCopiedList(){
        TODO()
    }

    //PRZYKŁAD 3
    fun addingObjects(){
        val sourceList = mutableListOf(1, 2, 3)
        val referenceList = sourceList
        referenceList.add(4)
        println("Source size: ${sourceList.size}")
    }

    //PRZYKŁAD 4
    fun iterateOverLists(){
        TODO()
    }

    //PRZYKŁAD 5
    fun mutableIterators(){
        TODO()
    }

    // ZADANIE 1
    fun removeOldFilms(): List<Film>{
        TODO()
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
