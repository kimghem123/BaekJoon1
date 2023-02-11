package com.example.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var v1 = br.readLine().toInt()
    var v2 = br.readLine()
    var sum = 0
    for(i in 0 until v1){
        sum += v2.get(i).toString().toInt()
    }
    bw.write(sum.toString())
    bw.flush()
    bw.close()
}