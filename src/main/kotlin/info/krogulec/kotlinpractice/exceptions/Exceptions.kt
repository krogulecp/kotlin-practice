package info.krogulec.kotlinpractice.exceptions

import java.nio.file.Path
import java.nio.file.Paths

class Exceptions {

    fun openFile(): List<String> {
        TODO()
    }

    private fun getResourcePath(fileName: String): Path {
        return Paths.get(javaClass.classLoader.getResource(fileName).path)
    }
}

class ExceptionsExample {

    fun throwingFun(): String {
        throw Exception("Throwing exception")
    }

    fun test() {
        val someValue = try {
            throwingFun()
        } catch (exception: Exception) {
            println("catching")
            "some value on exception"
        }

        println("after catching exception $someValue")
    }
}

fun main() {
    ExceptionsExample().test()
}
