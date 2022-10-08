package info.krogulec.kotlinpractice.conditions

class ConvertIfElseToWhen {

    fun getCurrency(country: String): String {
        return when (country) {
            "Poland" -> "PLN"
            "France" -> "EUR"
            "USA" -> "USD"
            "Italy" -> "EUR"
            else -> "UNKNOWN"
        }
    }
}
