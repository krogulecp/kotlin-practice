package info.krogulec.kotlinpractice.specialclasses

fun main() {
    SpecialClasses().test()
    Password("1234")
    val p: PasswordAlias = ""
}

class SpecialClasses {
    fun test() {
        val rambo = Film(
            title = "Rambo",
            genre = "Action",
            year = 1982
        )
        val ramboCopy = rambo.copy()
        val rambo2 = rambo.copy(title = "Rambo2", year = 1985)
        println(rambo)
        println(ramboCopy)
        println(rambo2)
    }
}

data class Film(
    val title: String,
    val genre: String,
    val year: Int,
)

interface Borrowable {
    fun someFunToImplement()
}

enum class Genre(val rawName: String) : Borrowable {
    COMEDY("comedy") {
        override fun doSth() {
            TODO("Not yet implemented")
        }
    },
    HORROR("horror") {
        override fun doSth() {
            TODO("Not yet implemented")
        }

        override fun someFunToImplement() {
            super.someFunToImplement()
        }
    };

    override fun someFunToImplement() {
        TODO("Not yet implemented")
    }

    abstract fun doSth()
}

@JvmInline
value class Password(val password: String) {

    init {
        println(password)
    }

    init {

    }

}

typealias PasswordAlias = String
