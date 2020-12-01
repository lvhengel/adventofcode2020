#!/usr/bin/env kotlin

@file:Include("../util/util.kts")

fun part1() {
    val input = readLines("input.txt").map(String::toInt)
    for ((index1, value1) in input.withIndex()) {
        for ((index2, value2) in input.withIndex()) {
            if (value1 + value2 === 2020) {
                println("Values are $value1 and $value2")
                println("Sum: " + value1 * value2)
            }
        }
    }
}

fun part2() {
    val input = readLines("input.txt").map(String::toInt)
    for ((index1, value1) in input.withIndex()) {
        for ((index2, value2) in input.withIndex()) {
            for ((index3, value3) in input.withIndex()) {
                if (value1 + value2 + value3 === 2020) {
                    println("Values are $value1,$value2,$value3")
                    println("Sum: " + value1 * value2 * value3)
                }
            }
        }
    }
}

part1()
part2()