class Day01 {
    fun part1(input: List<String>): Int {
        val caloriesList = ArrayList<Int>()
        caloriesList.add(0)

        for (line in input) {
            try {
                val calories = line.toInt()
                caloriesList[caloriesList.lastIndex] = caloriesList.last() + calories
            } catch (e: NumberFormatException) {
                caloriesList.add(0)
            }
        }

        return caloriesList.max()
    }

    fun part2(input: List<String>): Int {
        return input.size
    }
}
