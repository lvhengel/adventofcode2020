#!/usr/bin/env kotlin

@file:Include("../util/util.kts")

fun part1() {
    val input = readLines("input.txt").map(String::toInt)
    for (value1 in input) {
        for (value2 in input) {
            if (value1 + value2 === 2020) {
                println("Part 1:\nvalues are $value1 and $value2")
                println("sum: " + value1 * value2)
                return
            }
        }
    }
}

fun part2() {
    val input = readLines("input.txt").map(String::toInt)
    for (value1 in input) {
        for (value2 in input) {
            for (value3 in input) {
                if (value1 + value2 + value3 === 2020) {
                    println("Part 2:\nvalues are $value1,$value2,$value3")
                    println("sum: " + value1 * value2 * value3)
                    return
                }
            }
        }
    }
}

part1()
part2()