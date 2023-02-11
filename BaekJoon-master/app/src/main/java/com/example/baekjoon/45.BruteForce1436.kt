package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var number = 0
    var answer = br.readLine().toInt()
    var flag = 0
    while (true){
        var check = 0
        var test = number.toString()
        if(test.contains("666")) check++
        if(check>0) flag++
        if(flag == answer) break
        number++
    }
    println(number)
}