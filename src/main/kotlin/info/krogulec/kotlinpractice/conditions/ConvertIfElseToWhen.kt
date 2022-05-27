package info.krogulec.kotlinpractice.conditions

class ConvertIfElseToWhen {

    fun getCurrency(country: String): String {
        if (country == "Poland"){
            return "PLN"
        } else if (country == "France"){
            return "EUR"
        } else if (country == "USA") {
            return "USD"
        } else if (country == "Italy"){
            return "EUR"
        } else {
            return "UNKNOWN"
        }
    }
}
