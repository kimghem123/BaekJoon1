package com.example.baekjoon

import android.renderscript.ScriptGroup
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val s = readLine().toString()
    println(s.get(0).toInt())
}