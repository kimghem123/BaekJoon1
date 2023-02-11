package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var test = StringTokenizer(br.readLine())
    var v1 = test.nextToken().reversed()
    var v2 = test.nextToken().reversed()
    if(v1.toInt()>v2.toInt()) println(v1) else println(v2)
}