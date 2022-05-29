package info.krogulec.kotlinpractice.extensions

fun String.encodeWithCesarCipher(shift: Int): String {
    return this
        .map { letter -> Char(letter.code + shift) }
        .joinToString("")
}


fun String.printHello(name: String) {
    println("$name hello $this")
}

fun main() {
    "some string".printHello("John")
}
