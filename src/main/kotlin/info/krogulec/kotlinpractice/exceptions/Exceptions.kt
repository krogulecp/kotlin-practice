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
