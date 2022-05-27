package info.krogulec.kotlinpractice.types

import java.lang.Thread.sleep

fun main(){
    //sprawdzić dla użytkowników 73041622793 i 72060398474
    LazyLogicalOperators().userCanWork("73041622793")
}


class LazyLogicalOperators {

    fun userCanWork(pesel: String){
        // TODO zaimplementować logikę -> user może pracować jeśli jest pełnoletni i nie ma przeszłości kryminalnej
    }

    private fun getUserAge(pesel: String): Int{
        // zaimplementować pobranie wieku
        TODO()
    }

    private fun isAdult(userAge: Int): Boolean{
        // zaimplementować weryfikację pełnoletności
        TODO()
    }

    private fun userHasCriminalRecord(pesel: String): Boolean {
        // sprawdzić, czy user ma przeszłość kryminalną
        TODO()
    }
}

class UserService {
    fun getUserAge(pesel: String): Int? {
        // zaimplementować pobranie wieku
        TODO()
    }

    companion object {
        private val userDb: Map<String, Int> = mapOf(
            "73041622793" to 17,
            "72060398474" to 19,
            "63091729861" to 77
        )
    }
}

class PoliceService{
    fun getAllUserCrimes(pesel: String): List<String>{
        sleep(5000)
        return policeDb[pesel] ?: emptyList()
    }

    companion object {
        private val policeDb: Map<String, List<String>> = mapOf(
            "73041622793" to listOf("killed her husband", "killed her brother", "robbery"),
            "72060398474" to listOf("drinking in park", "robbery")
        )
    }
}
