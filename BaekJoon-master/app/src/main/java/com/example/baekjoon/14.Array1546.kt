package com.example.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var t = br.readLine().toInt()
    var f = mutableListOf<Float>()
    var c = mutableListOf<Float>()
    var d:Float = 0.0f
    var a = StringTokenizer(br.readLine())
    while(a.hasMoreTokens()){
        f.add(a.nextToken().toFloat())
    }
    var b = Collections.max(f)
    for(i in 0 until t){
        c.add((f[i]/b*100).toFloat())
    }
    c.forEach {
        d += it
    }
    println(d/t)
}