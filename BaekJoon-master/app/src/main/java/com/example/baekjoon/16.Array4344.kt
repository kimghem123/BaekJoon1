package com.example.baekjoon

fun main(array: Array<String>){
    val testCase = readLine()!!.toInt()
    repeat(testCase){
        var score = readLine()!!.split(" ").map { it.toInt() }
        var average = 0.0f
        var sum = 0
        var test = 0
        for(i in 1 until score.size){
            sum += score[i]
        }
        average = sum/score[0].toFloat()
        for(i in 1 until score.size){
            if(score[i]>average){
                test += 1
            }
        }
        var last:Float = (test.toFloat()/score.get(0).toFloat()*100) //float로 받으려면 계산하기 전에 float로 변환
        println("%.3f".format(last)+"%") //소수점 자르기
    }
}