import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
    val map = mutableMapOf<Char, Int>()

    str.forEach {
        val char = it.toUpperCase()

        if (map.containsKey(char)) {
            map[char] = map[char]!!.plus(1)
        } else {
            map.set(char, 1)
        }
    }

    val max = Collections.max(map.values)

    if (map.filter { it.value == max }.count() > 1) {
        println("?")
    } else {
        println(map.filter { it.value == max }.keys.first())
    }
}