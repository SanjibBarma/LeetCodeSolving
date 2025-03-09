package com.example.leetcodepractice

fun main() {
    val numsArr = intArrayOf(1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1)
    var count = 0

    val countList: MutableList<Int> = mutableListOf()

    for (num in numsArr) {
        if (num == 1) {
            count++
        } else {
            if (count > 0) {
                countList.add(count)
                count = 0
            }
        }
    }

    if (count > 0) {
        countList.add(count)
    }
    println("countList: $countList")

    var maxNum = countList[0]
    for (max in countList){
        if (max > maxNum){
            maxNum = max
        }
    }

    println("maxCount: $maxNum")
    println("maxCount: ${countList.max()}")
}
