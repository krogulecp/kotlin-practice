package info.krogulec.kotlinpractice.collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class CreatingCollectionsTest {

    @Test
    fun `should remove old films`(){
        //given
        val expectedFilms = listOf(
            Film("The Green Mile", 1999),
            Film("The Matrix", 1999),
            Film("Pulp Fiction", 1994),
        )

        //when
        val films = CreatingCollections().removeOldFilms()

        //then
        assertEquals(expectedFilms, films)
    }

    @Test
    fun `should check if film is from nineties`(){

        //when
        val notFromNineties = CreatingCollections().checkIfFilmIsFromNineties(Film("Rambo", 1982))
        val fromNineties = CreatingCollections().checkIfFilmIsFromNineties(Film("The Matrix", 1999))

        //then
        assertEquals(false, notFromNineties)
        assertEquals(true, fromNineties)
    }

    @Test
    fun `should prepare map`(){

        //when
        val result = CreatingCollections().buildMapFromFilmsRaw()

        //then
        assertEquals(result["Rambo"], 1982)
        assertEquals(result["The Green Mile"], 1999)
        assertEquals(result["The Matrix"], 1999)
        assertEquals(result["Pulp Fiction"], 1994)
        assertEquals(result["The Godfather"], 1972)
    }

    @Test
    fun `should join all collection elements`(){
        //given
        val expectedResult = "Films collection: Rambo - 1982 || The Green Mile - 1999 || The Matrix - 1999 || Pulp Fiction - 1994 || The Godfather - 1972"

        //when
        val result = CreatingCollections().joinAllRawFilms()

        //then
        assertEquals(expectedResult, result)
    }

    @Test
    fun `should filter films`(){
        //given
        val expectedResult = listOf(
            Film("The Green Mile", 1999),
            Film("The Matrix", 1999),
            Film("Pulp Fiction", 1994),
            Film("The Godfather", 1972)
        )

        //when
        val result = CreatingCollections().filterFilms()

        //then
        assertEquals(expectedResult, result)
    }

    @ParameterizedTest
    @CsvSource(value = [
        "2000, false",
        "1998, true",
        "1970, true",
        "2010, false",
        "1900, true",
    ])
    fun `should check if any films is after given year`(year: Int, expectedResult: Boolean){

        //when
        val result = CreatingCollections().anyFilmAfterGivenYear(year)

        //then
        assertEquals(expectedResult, result)
    }

    @Test
    fun `should sort films`(){
        //given
        val expectedResult = listOf(
            Film("The Godfather", 1972),
            Film("Rambo", 1982),
            Film("Pulp Fiction", 1994),
            Film("The Green Mile", 1999),
            Film("The Matrix", 1999),
        )

        //when
        val result = CreatingCollections().sortFilms()

        //then
        assertEquals(expectedResult, result)
    }
}
