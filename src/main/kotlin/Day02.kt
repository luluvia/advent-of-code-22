class Day02 {
    private val scores = mapOf(
        'X' to mapOf('A' to 4, 'B' to 1, 'C' to 7),
        'Y' to mapOf('A' to 8, 'B' to 5, 'C' to 2),
        'Z' to mapOf('A' to 3, 'B' to 9, 'C' to 6)
    )

    fun part1(input: List<String>): Int {
        var score = 0

        for (line in input) {
            val opChoice = line[0]
            val myChoice = line[2]

            score += scores[myChoice]!![opChoice]!!
        }

        return score
    }

    fun part2(input: List<String>): Int {
        return input.size
    }
}