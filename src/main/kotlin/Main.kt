import java.io.File
import java.io.FileNotFoundException

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: java -jar <jar name> <day>")
        return
    }

    val dayNumber = args[0].toInt()
    val day = dayFormat(dayNumber)

    println("\uD83C\uDF84 Advent of Code 2022 \uD83C\uDF84")
    println("\uD83D\uDCC5 Day selected: $dayNumber")

    try {
        val input = readInput(day)
        val dayClass = Class.forName(day)
        val dayInstance = dayClass.getConstructor().newInstance()

        try {
            val part1 = dayClass.getMethod("part1", List::class.java).invoke(dayInstance, input)
            println("\uD83C\uDF1F Part 1: $part1")
        } catch (e: NoSuchMethodException) {
            println("\uD83C\uDF1F Part 1: Not implemented")
        }

        try {
            val part2 = dayClass.getMethod("part2", List::class.java).invoke(dayInstance, input)
            println("\uD83C\uDF1F Part 2: $part2")
        } catch (e: NoSuchMethodException) {
            println("\uD83D\uDEAB Part 2: Not implemented")
        }
    } catch (e: FileNotFoundException) {
        println("No input file found for $day")
    } catch (e: ClassNotFoundException) {
        println("No class found for $day")
    }
}