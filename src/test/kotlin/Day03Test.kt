import kotlin.test.Test
import kotlin.test.assertEquals

class Day03Test {
    private val day = Day03()
    private val input = readTestInput("Day03_test")

    @Test
    fun testPart1() {
        val result = day.part1(input)

        assertEquals(157, result)
    }
}