package info.krogulec.kotlinpractice.specialclasses

class SpecialClasses {
    fun testDataClass() {
        val rambo = Film("Rambo", "action", 1982)
        val ramboSame = Film("Rambo", "action", 1982)
        val ramboNotData = FilmNotData("Rambo", "action", 1982)
        println("Data class: $rambo")
        println("Not data class: $ramboNotData")

        val ramboCopied = rambo.copy(genre = "thriller")

        println("Copied data class with modified object: $ramboCopied")

        println("Same params in data class ${rambo == ramboSame}")
    }
}

data class Film(
    val title: String,
    val genre: String,
    val year: Int,
) {
    val someProp: String
        get() {
            // uderzamy do zewnetrznego serwisu (very very very bad practice)
            return ""
        }
}

class FilmNotData(
    val title: String,
    val genre: String,
    val year: Int,
)

interface Borrowable {
    fun someFunToImplement()
}

enum class Genres(val rawName: String) : Borrowable {
    COMEDY("comedy") {
        override fun someAbstractMethod() {
            TODO("Not yet implemented")
        }

        override fun someFunToImplement() {
            TODO("Not yet implemented")
        }
    },
    ACTION("action") {
        override fun someAbstractMethod() {
            TODO("Not yet implemented")
        }

        override fun someFunToImplement() {
            println("concrete implementation of interface $rawName")
        }
    },
    HORROR("horror") {
        override fun someAbstractMethod() {
            TODO("Not yet implemented")
        }
    };

    // generalna implementacja dla wszystkich wartości
    override fun someFunToImplement() {
        println("general implementation of interface")
    }

    fun doSomething() {
        // tutaj możemy tworzyć funkcje
    }

    // można tworzyć abstrakcyjne metody w enumie
    abstract fun someAbstractMethod()
}

@JvmInline
value class Password(val password: String)

typealias PasswordAlias = String

fun main() {
    SpecialClasses().testDataClass()
    println("Enum name: ${Genres.HORROR.name}")
    println("Enum ordinal: ${Genres.HORROR.ordinal}")
    println("Enum property: ${Genres.HORROR.rawName}")

    val createdEnum = Genres.valueOf("COMEDY")

    println(createdEnum)

    println("Overriding priority specific: ${Genres.ACTION.someFunToImplement()}")
    println("Overriding priority general: ${Genres.HORROR.someFunToImplement()}")

    val password = Password("verySecurePassword")
    val passwordAlias: PasswordAlias = "otherVerySecurePassword"
}

