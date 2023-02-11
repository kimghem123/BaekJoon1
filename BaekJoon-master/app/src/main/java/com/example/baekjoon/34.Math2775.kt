package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = br.readLine().toInt()

    repeat(T){
        var test = mutableListOf<Int>()
        var k = br.readLine().toInt()
        var n = br.readLine().toInt()
        for(i in 0 until n) test.add(i,i+1)

        var num = 1
        while(num<=k){
            var test1 = mutableListOf<Int>(1)
            for(j in 1 until n) test1.add(j,test1[j-1]+test[j])
            test = test1
            num++
        }
        println(test.last())
    }
}