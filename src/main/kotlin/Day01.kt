class Day01 {
    fun part1(input: List<String>): Int {
        val caloriesList = getCaloriesList(input)

        return caloriesList.max()
    }

    fun part2(input: List<String>): Int {
        val caloriesList = getCaloriesList(input)

        val sum = getTopCalories(caloriesList, 3).sum()

        return sum
    }

    private fun getCaloriesList(input: List<String>): ArrayList<Int> {
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

        return caloriesList
    }

    @Suppress("SameParameterValue")
    private fun getTopCalories(caloriesList: ArrayList<Int>, top: Int): ArrayList<Int> {
        val topCalories = ArrayList<Int>()
        for (i in 0 until top) {
            topCalories.add(caloriesList.max())
            caloriesList.remove(caloriesList.max())
        }

        return topCalories
    }
}
