package com.example.baekjoon

import java.util.*

fun main(array: Array<String>){
    val t = readLine()!!.toInt()
    var s = readLine()!!.split(" ").map { it.toInt() }
    s = s.sorted()
    println(s)
    println("${s.get(0)} ${s.last()}")
}
