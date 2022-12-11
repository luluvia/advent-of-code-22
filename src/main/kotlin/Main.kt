import java.io.File

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: java -jar <jar name> <day>")
        return
    }

    val dayNumber = args[0].toInt()
    val day = dayFormat(dayNumber)
    val input = readInput(day)
    val dayClass = Class.forName(day)
    val dayInstance = dayClass.getConstructor().newInstance()
    val part1 = dayClass.getMethod("part1", List::class.java).invoke(dayInstance, input)
    val part2 = dayClass.getMethod("part2", List::class.java).invoke(dayInstance, input)

    println("\uD83C\uDF84 Advent of Code 2022 \uD83C\uDF84")
    println("\uD83D\uDCC5 Day selected: $dayNumber")
    println("\uD83C\uDF1F Part 1: $part1")
    println("\uD83C\uDF1F Part 2: $part2")
}