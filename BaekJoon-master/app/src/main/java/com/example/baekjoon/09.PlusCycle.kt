package com.example.baekjoon

import android.renderscript.ScriptGroup
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(array: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var a = br.readLine().toInt()
    var g = a
    var t = 0
    while(true){
        var b = g/10
        var c = g%10
        var f = 0
        if(b+c>=10) f = (b+c)%10 else f = b+c
        g = (c*10)+f
        t += 1
        if(a==g) break
    }
    bw.write(t.toString())
    bw.flush()
    bw.close()
}