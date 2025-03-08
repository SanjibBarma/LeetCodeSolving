package com.example.leetcodepractice

fun main(){
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    println("nums: ${nums.joinToString()}")

//    using hashmap
    val map: HashMap<Int, Int> = HashMap()
    for (num in nums){
        map[num] = num;
    }
    val hashMapSize = map.size
    println("hashMap array size: $hashMapSize and map is: ${map.values}")



//    using hashset
    val set: HashSet<Int> = HashSet()
    for (num in nums){
        set.add(num)
    }
    val hashSetSize = set.size
    println("hashSet array size: $hashSetSize and set is $set")




//    usung distinct
    val sortedDistinct = nums.distinct()
    println("sortedDistinct array size: ${sortedDistinct.size} and set is $sortedDistinct")



//    using toSet (similarly return a list or set like hashSet but not sorted)
    val sortedToSetToList = nums.toSet()
    println("sortedToSetToList array size: ${sortedToSetToList.size} and set is $sortedToSetToList")



//    using sorted make sure to sort the values
    val sortedToSetToSorted = nums.toSet().sorted()
    println("sortedToSetToSorted array size: ${sortedToSetToSorted.size} and set is $sortedToSetToSorted")

}