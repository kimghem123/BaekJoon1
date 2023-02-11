package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>) {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val number = br.readLine().split(" ").map { it.toInt() }
    var array = Array(number.get(0), { Array(number.get(1), { "" }) })
    var count = 0
    var count1 =0
    var result = 100

    val whiteChess = arrayOf(
        arrayOf("W", "B", "W", "B", "W", "B", "W", "B"),
        arrayOf("B", "W", "B", "W", "B", "W", "B", "W"),
        arrayOf("W", "B", "W", "B", "W", "B", "W", "B"),
        arrayOf("B", "W", "B", "W", "B", "W", "B", "W"),
        arrayOf("W", "B", "W", "B", "W", "B", "W", "B"),
        arrayOf("B", "W", "B", "W", "B", "W", "B", "W"),
        arrayOf("W", "B", "W", "B", "W", "B", "W", "B"),
        arrayOf("B", "W", "B", "W", "B", "W", "B", "W")
    )
    val blackChess = arrayOf(
        arrayOf("B", "W", "B", "W", "B", "W", "B", "W"),
        arrayOf("W", "B", "W", "B", "W", "B", "W", "B"),
        arrayOf("B", "W", "B", "W", "B", "W", "B", "W"),
        arrayOf("W", "B", "W", "B", "W", "B", "W", "B"),
        arrayOf("B", "W", "B", "W", "B", "W", "B", "W"),
        arrayOf("W", "B", "W", "B", "W", "B", "W", "B"),
        arrayOf("B", "W", "B", "W", "B", "W", "B", "W"),
        arrayOf("W", "B", "W", "B", "W", "B", "W", "B")
    )

    for (i in 0 until number.get(0)) {
        var list = br.readLine().chunked(1)
        for (j in 0 until number.get(1)) {
            array[i][j] = list.get(j)
        }
    }

    println(whiteChess.contentDeepToString())
    println(array.contentDeepToString())
    for (i in 0 until number.get(0) - 7) {
        for (j in 0 until number.get(1) - 7) {

            for (k in i until i + 8) {
                for (t in j until j + 8) {
                    if (whiteChess[k - i][t - j] != array[k][t]){
                        count++
                    }
                }
            }
            for (k in i until i + 8) {
                for (t in j until j + 8) {
                    if (blackChess[k - i][t - j] != array[k][t]) {
                        count1++
                    }
                }
            }
            if (count1 >= count && result>count) result = count
            if (count1 <= count && result>count1) result = count1
            count = 0
            count1 = 0
        }
    }
    println(result)
}


