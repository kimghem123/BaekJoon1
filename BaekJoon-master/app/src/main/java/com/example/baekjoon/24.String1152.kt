package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    val br= BufferedReader(InputStreamReader(System.`in`))
    var test = StringTokenizer(br.readLine())
    println(test.countTokens())
}