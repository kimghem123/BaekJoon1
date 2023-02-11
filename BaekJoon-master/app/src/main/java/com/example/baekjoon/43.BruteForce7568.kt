package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    var weightList = mutableListOf<Int>()
    var lenghtList = mutableListOf<Int>()
    var result = Array(N){0}
    for(i in 0 until N){
        var info  = StringTokenizer(br.readLine())
            lenghtList.add(info.nextToken().toInt())
            weightList.add(info.nextToken().toInt())
    }
    for(i in 0 until N){
        for(k in i+1 until N){
            if(lenghtList[i]<lenghtList[k]&&weightList[i]<weightList[k]) result[i] += 1
            else if(lenghtList[i]>lenghtList[k]&&weightList[i]>weightList[k]) result[k] += 1
        }
    }
    for(i in 0..N-1){
        println("${(result[i]+1)} ")
    }
}