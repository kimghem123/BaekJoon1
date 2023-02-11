import java.util.*

fun main(array: Array<String>){
    val test = readLine()!!.toInt()
    repeat(test){
        var v1 = StringTokenizer(readLine())
        var v2 = v1.nextToken().toInt()
        var v3 = v1.nextToken()
        var result = ""
        for (i in 0 until v2) {
            for(j in 1..v2)
                result += v3[i]
        }
        println(result)
    }
}