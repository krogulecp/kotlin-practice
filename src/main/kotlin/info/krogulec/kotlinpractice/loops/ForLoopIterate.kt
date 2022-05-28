package info.krogulec.kotlinpractice.loops

class ForLoopIterate {

    fun returnAllNumbersFromMaxToMinWithStep2(max: Int, min: Int): List<Int>{
        val result = mutableListOf<Int>()
        for (i: Int in max downTo min step 2) {
            result.add(i)
        }
        return result
    }
}
