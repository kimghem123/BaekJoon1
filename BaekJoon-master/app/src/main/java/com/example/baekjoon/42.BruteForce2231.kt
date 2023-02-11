package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()
    var number:Int = 0
    var m = 0
    while(true){
        for(j in 0 until m.toString().length){
            number += m.toString().get(j).digitToInt()
        }
        number += m
        if(number == n){
            println(m)
            break
        }
        number=0
        m++
        if(m>n) {
            println(0)
            break
        }
    }
}