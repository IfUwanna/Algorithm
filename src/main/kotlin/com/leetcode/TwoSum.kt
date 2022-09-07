package com.leetcode

import java.util.HashMap

/**
 * Created by jihun.park@navercorp.com on 2022-09-07.
 */
class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        val len = nums.size;
        val map = mutableMapOf<Int,Int>()   // target-nums[idx], idx
        for (i in 0 until len) {
            if(map.containsKey(target-nums[i])){
                return intArrayOf(i, map[target-nums[i]]!!)
            }
            map[nums[i]] = i
        }
/*        for ((i,num) in nums.withIndex()) {
            println("len : $len")
            println("num : $num")
            println("idx : $idx")*/
        return intArrayOf();
    }
}


