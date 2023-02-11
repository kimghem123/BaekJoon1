package com.example.baekjoon

//fun main(array:Array<String>){
//    val t = readLine()!!.toInt()
//    for(i in 1..t){
//        for(j in 1..i)
//            print("*")
//        println()
//    }
//}

fun main(array: Array<String>){
    val t = readLine()!!.toInt()
    for( i in 1..t){
        println("*".repeat(i))
    }
}