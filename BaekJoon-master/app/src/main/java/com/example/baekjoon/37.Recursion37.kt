package com.example.baekjoon
fun main(array: Array<String>){
    val a = readLine()!!.toInt()
    println(test(a))
}

fun test(number:Int):Int{
    if(number == 0) return 1
    else return number * test(number-1)
}