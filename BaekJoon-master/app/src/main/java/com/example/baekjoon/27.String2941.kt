package com.example.baekjoon

import android.renderscript.ScriptGroup
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val alphabet = arrayOf("c=","c-","dz=","d-","lj","nj","s=","z=")
    var test = br.readLine().toString()
    for(i in alphabet){
        test = test.replace(i,"a")
    }
    println(test.length)
}