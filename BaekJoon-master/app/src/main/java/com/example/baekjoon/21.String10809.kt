package com.example.baekjoon

fun main(array: Array<String>){
    var array1 = Array(26,{-1})
    var test = readLine()!!

    for( i in test.indices){
        if(array1[test[i].toInt()-97]==-1) array1[test[i].toInt()-97] = i
    }
    array1.forEach { print("$it ") }
}