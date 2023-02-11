package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var T = br.readLine().toInt()
    var count = 0
    while(true){
        if(T%5 == 0){
            println(T/5+count)
            break
        }
        else if(T <= -1) {
            println(-1)
            break
        }
        T -= 3
        count++
    }
}
