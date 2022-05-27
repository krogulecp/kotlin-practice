package info.krogulec.kotlinpractice.loops

class WhileLoopIterate {
    fun returnAllResultsInSingleList(phrase: String): List<String>{
        TODO()
    }
}

class GoogleSearchClient {

    fun search(phrase: String, pageNumber: Int): ResultsPage {
        return ResultsPage(pageNumber, pageNumber > 3, listOf(phrase + pageNumber, phrase + pageNumber))
    }
}

data class ResultsPage(val pageNumber: Int, val isLast: Boolean, val results: List<String>)
