package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = StringTokenizer(br.readLine())
    val N = T.nextToken().toInt()
    val M = T.nextToken().toInt()
    val number = StringTokenizer(br.readLine())
    var cardList  = mutableListOf<Int>()
    var sumResult = 0
    var final = 0
    while(number.hasMoreTokens()){
        cardList.add(number.nextToken().toInt())
    }
    for(i in 0 until N-2){
        for(j in i+1 until N-1){
            for(k in j+1 until N){
                sumResult = cardList[i]+cardList[j]+cardList[k]
                if(sumResult<=M&&sumResult>=final) final = sumResult
            }
        }
    }
    print(final)
}