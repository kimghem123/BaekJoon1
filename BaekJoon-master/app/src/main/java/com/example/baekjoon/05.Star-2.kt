package com.example.baekjoon

fun main(array: Array<String>){
    val t = readLine()!!.toInt()
    for( i in 1..t){
        for(j in t downTo  i+1) {
            print(" ")
        }
        println("*".repeat(i))
    }
}