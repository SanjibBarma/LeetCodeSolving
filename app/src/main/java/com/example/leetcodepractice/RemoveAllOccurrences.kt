package com.example.leetcodepractice


fun main(){
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val removeVal = 1

    //iterative function

    //using filter
    val filterData = nums.filter { it != removeVal }
    println("filterData: $filterData")


    //using filter not
    val filterNotData = nums.filterNot { it == removeVal }
    println("filterNotData: $filterNotData")


    //using partition (matching, non-matching pair)
    val (partitionData, removedData) = nums.partition { it != removeVal }
    println("partitionData: $partitionData")
    println("removedData: $removedData")

}