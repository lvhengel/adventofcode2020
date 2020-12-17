#!/usr/bin/env kotlin

//INCLUDE ../util/util.kts

fun part1() {
    val input: String = readText("input.txt")
    val groups = input.split("\n\n")

    var total = 0
    groups.forEach{
        val map = mutableMapOf<Char, Int>()
        val lines = it.split("\n")
        lines.forEach{
            it.forEach {
                if (map.containsKey(it)) {
                    map.put(it, map.getOrDefault(it, 0).plus(1))
                } else {
                    map.put(it, 1)
                }
            }
        }
        total = total + map.entries.size
    }
    println("Part 1: " + total)
}

fun part2() {
    val input: String = readText("input.txt")
    val groups = input.split("\n\n")

    var total = 0
    groups.forEach{
        val map = mutableMapOf<Char, Int>()
        val lines = it.split("\n")
        lines.forEach{
            it.forEach {
                if (map.containsKey(it)) {
                    map.put(it, map.getOrDefault(it, 0).plus(1))
                } else {
                    map.put(it, 1)
                }
            }
        }
        map.forEach{
            if (it.value == lines.size) {
                total++
            }
        }
    }
    println("Part 2: " + total)
}

part1()
part2()