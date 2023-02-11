package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var t = 1
    var x = 0
    while(true){
        x += t
        if(x>=n){
            break
        }
        t++
    }
    if(t%2!=0)println("${1+(x-n)}/${t-(x-n)}")
    else println("${t-(x-n)}/${1+(x-n)}")
}