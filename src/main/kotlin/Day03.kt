class Day03 {
    fun part1(input: List<String>): Int {
        var priorityScore = 0

        for (line in input) {
            val matchingChar = getMatchingChar(line)
            priorityScore += getPriorityScore(matchingChar)
        }

        return priorityScore
    }

    private fun getMatchingChar(line: String): Char {
        val firstRucksackRange = IntRange(0, line.length/2 - 1)
        val secondRucksackRange = IntRange(line.length/2, line.length - 1)

        for (char in line.substring(firstRucksackRange)) {
            if (char in line.substring(secondRucksackRange)) {
                return char
            }
        }

        throw IllegalArgumentException("Line does not contain matching character")
    }

    private fun getPriorityScore(matchingChar: Char): Int {
        return if (matchingChar.isLowerCase()) {
            matchingChar.code - 96
        } else {
            matchingChar.code - 38
        }
    }
}