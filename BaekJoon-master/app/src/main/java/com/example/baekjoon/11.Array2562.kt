package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var s = mutableListOf<Int>()
    for(i in 0..8){
        val a = br.readLine().toInt()
        s.add(a)
    }
    val maxNum = Collections.max(s)
    val maxIndex = s.indexOf(maxNum)
    println(maxNum)
    println(maxIndex)
}