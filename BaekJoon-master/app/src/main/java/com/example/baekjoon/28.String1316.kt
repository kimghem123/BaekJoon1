package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var number = br.readLine().toInt()
    var result = 0
    repeat(number) {
        var test = br.readLine()
        val array = listOf<Char>(test[0])
        var flag = true

        for (i in 1 until test.length) {
            if (test[i] != test[i - 1]) {
                if(array.contains(test[i])){
                    flag = false
                    break
                }
                array.plus(test[i])
            }
        }
        if(flag) result++
    }
    println(result)
}