package com.example.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    for(i in 1..br.readLine().toInt()){
        var s =br.readLine().split(' ').map { it.toInt() }
        bw.write("Case #$i: ${s[0]} + ${s[1]} = ${s[0]+s[1]}\n")
    }
    bw.flush()
    bw.close()
}