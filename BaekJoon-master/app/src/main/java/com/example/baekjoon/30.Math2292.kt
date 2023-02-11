import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var x = 1
    var t = 1

    if (n == 1) {
        println(1)
    } else {
        while (true) {
            if (x + (6 * t) >= n) {
                println(t + 1)
                break
            }
            x += 6 * t
            t++
            }
        }
}