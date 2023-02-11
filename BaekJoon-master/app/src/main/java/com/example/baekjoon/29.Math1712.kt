package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val test = StringTokenizer(br.readLine())
    var a = test.nextToken().toInt()
    var b = test.nextToken().toInt()
    var c = test.nextToken().toInt()
    var v = 1

    if(b<c){
        v = a/(c-b) + 1
    }else v = -1
    println(v)
}