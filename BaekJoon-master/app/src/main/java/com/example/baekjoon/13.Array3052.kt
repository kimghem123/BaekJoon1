package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br =BufferedReader(InputStreamReader(System.`in`))
    var c = mutableListOf<Int>()
    var t = 0
    for(i in 1..10){
        c.add(br.readLine().toInt()%42)
    }
    var d = HashSet<Int>(c)
    println(d.size)
}