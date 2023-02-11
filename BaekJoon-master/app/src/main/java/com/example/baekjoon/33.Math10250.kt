package com.example.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var t = br.readLine().toInt()
    repeat(t){
        var token = StringTokenizer(br.readLine())
        var H = token.nextToken().toInt()
        var W = token.nextToken().toInt()
        var N = token.nextToken().toInt()
        var v1 = 0
        var v2 = 0
        if(N%H==0) v1 = H*100 else v1 = (N%H)*100
        for(i in 1..W){
            if(H*i >= N) {
                v2 = i
                break
            }
        }
        bw.write((v1+v2).toString()+"\n")
    }
    bw.flush()
    bw.close()
}