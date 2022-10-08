package info.krogulec.kotlinpractice.types

import java.lang.Thread.sleep

fun main(){
    //sprawdzić dla użytkowników 73041622793 i 72060398474
    val lazyLogicalOperators = LazyLogicalOperators(PoliceService(), UserService())

    //not adult
    println("User 73041622793 can work -> ${lazyLogicalOperators.userCanWork("73041622793")}")

    //is adult and has criminal record
    println("User 72060398474 can work -> ${lazyLogicalOperators.userCanWork("72060398474")}")

    //is adult and does not have criminal record
    println("User 63091729861 can work -> ${lazyLogicalOperators.userCanWork("63091729861")}")

    //pesel not found
    println("User 0000000000 can work -> ${lazyLogicalOperators.userCanWork("0000000000")}")

}

class LazyLogicalOperators(
    private val policeService: PoliceService,
    private val userService: UserService,
) {
    fun userCanWork(pesel: String) = (isAdult(getUserAge(pesel))) && !userHasCriminalRecord(pesel)
    private fun getUserAge(pesel: String) = userService.getUserAge(pesel) ?: throw RuntimeException("User not found!")
    private fun isAdult(userAge: Int) = userAge >= 18
    private fun userHasCriminalRecord(pesel: String) = policeService.getAllUserCrimes(pesel).isNotEmpty()
}

class UserService {
    fun getUserAge(pesel: String) = userDb[pesel]

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
