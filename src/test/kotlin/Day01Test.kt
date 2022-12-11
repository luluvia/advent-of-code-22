import kotlin.test.Test
import kotlin.test.assertEquals

class Day01Test {
    private val day = Day01()
    private val input = readTestInput("Day01_test")

    @Test
    fun testPart1() {
        val result = day.part1(input)

        assertEquals(24000, result)
    }

    @Test
    fun testPart2() {
        val result = day.part2(input)
    }
}