package com.example.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while(true){
        var s = br.readLine().split(" ").map { it.toInt() }
        if(s[0]+s[1]==0) break
        bw.write((s[0]+s[1]).toString()+"\n")
    }
    bw.flush()
    bw.close()
}