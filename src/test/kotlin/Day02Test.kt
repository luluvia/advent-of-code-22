import kotlin.test.Test
import kotlin.test.assertEquals

class Day02Test {
    private val day = Day02()
    private val input = readTestInput("Day02_test")

    @Test
    fun testPart1() {
        val result = day.part1(input)

        assertEquals(15, result)
    }
}