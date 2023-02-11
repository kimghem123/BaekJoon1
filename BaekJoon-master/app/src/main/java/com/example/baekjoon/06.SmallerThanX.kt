package com.example.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var b = br.readLine().split(" ").map { it.toInt() }
    var c = br.readLine().split(" ").map { it.toInt() }
    for(i in 0 until b[0]){
        if(c[i]<b[1]){
            bw.write(c[i].toString()+" ")
        }
    }
    bw.flush()
    bw.close()
}
