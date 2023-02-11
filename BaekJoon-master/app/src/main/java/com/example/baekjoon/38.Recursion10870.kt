import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    print(fibonacci(input))
}

fun fibonacci(N: Int): Int {
    return if (N < 2) N else fibonacci(N - 1) + fibonacci(N - 2)
}

//fun fibonacci(N: Int): Int = when (N) {	//코틀린스럽게
//    0 -> 0
//    1 -> 1
//    else -> fibonacci(N - 1) + fibonacci(N - 2)
//}