package com.example.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//빠른 입출력
fun main(array: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    for(i in 1..br.readLine().toInt()){
        var s = i.toString()
        bw.write(s+"\n")
    }
    bw.flush()
    bw.close()
}

//느리기때문에 실패
//fun main(array: Array<String>){
//    val s = readLine()!!.toInt()
//    for(i in 0..s){
//        println(i)
//    }
//}

//정석
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine()) //공백을 기준으로 스트링을 스플릿
        val sum = (token.nextToken().toInt() + token.nextToken().toInt()).toString()
        bw.write(sum + "\n")
    }
    bw.flush()
    bw.close()
}