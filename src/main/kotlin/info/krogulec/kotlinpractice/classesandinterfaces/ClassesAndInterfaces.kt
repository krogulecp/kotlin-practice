package info.krogulec.kotlinpractice.classesandinterfaces

fun main() {
    val classesAndInterfaces = ClassesAndInterfaces()
    ClassesAndInterfaces.NestedClass()
    classesAndInterfaces.NestedInnerClass().testNestedInner()

}

class ClassesAndInterfaces private constructor(
    val param: String
    //tutaj nie może być kodu (tylko properties)
) {

    constructor() : this("") {
        //teoretycznie tutaj możemy wywołać jakiś kod
    }

    init {
        println("first init block")
    }

    init {
        println("second init block")
    }

    init {
        println("third init block")
    }

    fun classCanHaveManyFunctions() {

    }

    class NestedClass {
        fun testNested() {

        }
    }

    inner class NestedInnerClass {
        fun testNestedInner() {
            println("Klasa inner ma dostęp do parametrów klasy zewnętrznej $param")
        }
    }

    companion object {}

    object MySingleton {

    }
}

abstract class MyAbstractClass() {
    // działa podobnie jak w javie
}

interface MyInterface {
    val propToImplement: String
    // val propWithDefaultImpl: String = "" // not allowed in kotlin

    fun toImplement(): Int
    fun withDefaultImpl() {

    }

    companion object {
        const val CONST = ""
    }
}

class SomeClassImplementingInterface : MyInterface {
    override val propToImplement = ""

    override fun toImplement(): Int {
        TODO("Not yet implemented")
    }
}

class SomeClassImplementingInterfaceVer2(override val propToImplement: String) : MyInterface {
    override fun toImplement(): Int {
        TODO("Not yet implemented")
    }
}

class SomeClassExtendingAbstractClass : MyAbstractClass()
