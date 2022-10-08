package info.krogulec.kotlinpractice.loops

class WhileLoopIterate {
    fun returnAllResultsInSingleList(phrase: String): List<String>{
        val finalResult = mutableListOf<String>()
        var pageNumber = 0

        do {
            val searchResult = GoogleSearchClient().search(phrase, pageNumber)
            finalResult.addAll(searchResult.results)
            pageNumber++
        } while (!searchResult.isLast)

        return finalResult
    }
}

class GoogleSearchClient {

    fun search(phrase: String, pageNumber: Int): ResultsPage {
        return ResultsPage(pageNumber, pageNumber > 3, listOf(phrase + pageNumber, phrase + pageNumber))
    }
}

data class ResultsPage(val pageNumber: Int, val isLast: Boolean, val results: List<String>)
