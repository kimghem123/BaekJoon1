package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var t = br.readLine().toInt()
    var score = 0
    var finalScore = 0
    repeat(t){
        val ox = br.readLine()
        for(i in 0 until ox.length) {
            if (ox[i] == 'O') {
                score += 1
                finalScore += score
            } else {
                score = 0
            }
        }
        println(finalScore)
        score = 0
        finalScore = 0
    }
}