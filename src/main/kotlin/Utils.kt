import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

fun dayFormat(day: Int): String = "Day%02d".format(day)

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("inputs/live/$name.txt")
    .readLines()

/**
 * Reads lines from the given input txt test file.
 */
fun readTestInput(name: String) = File("inputs/test/$name.txt")
    .readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')

/**
 * The cleaner shorthand for printing output.
 */
fun Any?.println() = println(this)
