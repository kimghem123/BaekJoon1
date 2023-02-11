package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br =BufferedReader(InputStreamReader(System.`in`))
    var b = 1
    var t = 0
    for(i in 1..3){
        b *= br.readLine().toInt()
    }
    var c = b.toString().split("")
    for(j in 0..9) {
        for (k in 0..c.size-1) {
            if (c[k] == j.toString()) t += 1
        }
        println(t)
        t = 0
    }
}