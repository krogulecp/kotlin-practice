package info.krogulec.kotlinpractice.loops

class WhileLoopIterate {
    fun returnAllResultsInSingleList(phrase: String): List<String>{
        val returnList = mutableListOf<String>()
        var pageNumber = 0

        do {
            val result: ResultsPage = GoogleSearchClient().search(phrase, pageNumber)

            returnList.addAll(result.results)
            pageNumber++

        } while (!result.isLast)

        return returnList

    }
}

class GoogleSearchClient {

    fun search(phrase: String, pageNumber: Int): ResultsPage {
        return ResultsPage(pageNumber, pageNumber > 3, listOf(phrase + pageNumber, phrase + pageNumber))
    }
}

data class ResultsPage(val pageNumber: Int, val isLast: Boolean, val results: List<String>)
