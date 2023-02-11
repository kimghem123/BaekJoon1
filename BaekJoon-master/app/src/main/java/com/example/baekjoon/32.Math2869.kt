package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var test = StringTokenizer(br.readLine())
    var morning = test.nextToken().toInt()
    var night = test.nextToken().toInt()
    var tree = test.nextToken().toInt()
    var length = tree - morning
    var test1 = morning - night
    var day = length/test1
    if(length % test1 == 0) day++ else day += 2
    println(day)
}