package com.example.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main(array: Array<String>) {
    val N = br.readLine().toInt()
    for(y in 0 until N){
        for(x in 0 until N){
            star(x, y, N/3)
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}

fun star(x: Int, y: Int, num: Int) {

    if((x/num)%3==1&&(y/num)%3==1) bw.write(" ")
    else if(num==1)bw.write("*")
    else star(y,x,num/3)
}