package com.example.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.math.BigDecimal
import java.math.BigInteger

var count = BigDecimal.ZERO
val br1 = BufferedReader(InputStreamReader(System.`in`))
val sb = StringBuilder()
fun main(array: Array<String>){
    val num = br1.readLine().toInt()
    hanoi(num,1,3,2)
    println(count)
    print(sb)
}

fun hanoi(num:Int,from:Int,to:Int, other:Int){
    if(num == 1) {
        sb.append("$from $to\n")
    }
    else {
        hanoi(num-1,from,other,to)
        sb.append("$from $to\n")
        hanoi(num-1,other,to,from)
    }
    count++
}