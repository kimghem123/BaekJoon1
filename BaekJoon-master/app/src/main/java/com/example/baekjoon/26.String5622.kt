package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var test1 = mutableMapOf<Char,Int>()
    for(i in 'A'..'Z'){
        when(i){
            in 'A'..'C' -> test1.set(i,3)
            in 'D'..'F' -> test1.set(i,4)
            in 'G'..'I' -> test1.set(i,5)
            in 'J'..'L' -> test1.set(i,6)
            in 'M'..'O' -> test1.set(i,7)
            in 'P'..'S' -> test1.set(i,8)
            in 'T'..'V' -> test1.set(i,9)
            in 'W'..'Z' -> test1.set(i,10)
        }
    }
    var test = br.readLine()
    var sum = 0
    test.forEach {
        sum += test1.get(it)!!
    }
    println(sum)
}