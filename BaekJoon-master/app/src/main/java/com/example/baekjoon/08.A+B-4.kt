package com.example.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while(true){
        var str = br.readLine() ?: break
        var s = StringTokenizer(str)
        bw.write((s.nextToken().toInt()+s.nextToken().toInt()).toString()+"\n")
    }
    bw.flush()
    bw.close()
}