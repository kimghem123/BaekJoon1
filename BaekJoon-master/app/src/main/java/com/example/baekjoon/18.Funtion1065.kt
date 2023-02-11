package com.example.baekjoon

import android.renderscript.ScriptGroup
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(array: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var c = 0
    c = number(br.readLine().toInt())
    bw.write(c.toString())
    bw.flush()
    bw.close()
}

fun number(test: Int): Int {
    var a = 0
    for (i in 1..test) {
        when (i) {
            in 1..9 -> {
                a += 1
            }
            in 10..99 -> {
                a += 1
            }
            in 100..999 -> {
                if(i/100 - i/10%10 == i/10%10 - i%10)
                    a += 1
            }
            1000 -> {
                if(i/1000 - i/100%10 == i/100%10 - i/10%10 && i/100%10 - i/10%10 == i/10%10 - i%10)
                    a += 1
            }
        }
    }
    return a
}