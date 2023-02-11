package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = StringTokenizer(br.readLine())
    var a = T.nextToken().toBigDecimal()
    var b = T.nextToken().toBigDecimal()
    println(a.add(b))
}