package com.example.baekjoon

    fun main(array: Array<String>){
       var max = 10000
        var test = IntArray(max)
        var sum = 0
        for(i in 0 until max) {
            sum = make(i)
            if(sum<max)test.set(sum,1)
        }
        test.forEachIndexed() {index, it->
            if(it < 1)println(index)
        }
    }
    fun make(a:Int): Int{
        var b = a+(a/1000)+(a/100%10)+(a/10%10)+(a%10)
        return b
    }