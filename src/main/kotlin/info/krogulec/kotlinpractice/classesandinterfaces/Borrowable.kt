package info.krogulec.kotlinpractice.classesandinterfaces

interface Borrowable {
    var borrowed: Boolean

    fun borrow()
    fun returnItem()
    fun canBeBorrowed(): Boolean {
        return !borrowed
    }
}

open class Film(override var borrowed: Boolean) : Borrowable {

    override fun borrow() {
        if (canBeBorrowed()) {
            borrowed = true
        }
    }

    override fun returnItem() {
        if (borrowed) {
            borrowed = false
        }
    }
}

interface Other

class Comedy : Film(false), Other {
    // można dziedziczyć tylko po jednej klasie, ale implementować wiele interfejsów
}
