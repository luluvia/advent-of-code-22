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

    println("Part 1: $part1")
}