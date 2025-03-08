package com.example.leetcodepractice

fun main(){
    val intArr = intArrayOf(1, 1, 1, 2, 2, 9, 9, 9)
    println("intArr: ${intArr.joinToString()}")

    val intArrNum = intArr.joinToString(separator = "")
    println("intArrNum: $intArrNum")

    val sum = intArrNum.toInt() + 1
    println("intArrNum plus one: $sum")

    val sumIntArr = sum.toString().map{ it.toString().toInt() }
    println("intArrNum plus one arr: $sumIntArr")

}