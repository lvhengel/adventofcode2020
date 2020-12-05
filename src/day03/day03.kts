#!/usr/bin/env kotlin

@file:Include("../util/util.kts")


fun part1() {
    val input = readLines("input.txt")

    val rows = input.size
    val cols = input[0].length

    println("rows: $rows")
    println("cols: $cols")

    val map = Array(rows, { CharArray(cols) })
    for ((y, line) in input.withIndex()) {
        for ((x, char) in line.withIndex()) {
            map[y][x] = char
        }
        println(y)
    }

    var trees = 0
    var right = 0
    for (i in 1..rows - 1) {
        right = (right + 3) % cols
        println("x: $i  y: $right")
        println(map[i][right])
        if (map[i][right] == '#') {
            trees++
        }
    }

    println(trees)

}

fun part2() {
    val input = readLines("input.txt")

    val rows = input.size
    val cols = input[0].length

    println(rows)

    val map = Array(rows, { CharArray(cols) })
    for ((y, line) in input.withIndex()) {
        for ((x, char) in line.withIndex()) {
            map[y][x] = char
        }
    }

    var total: Long = 1
    val slopes = listOf(
        Pair(1, 1),
        Pair(3, 1),
        Pair(5, 1),
        Pair(7, 1),
        Pair(1, 2)
    )
    slopes.forEach {
        var trees = 0
        var right = 0
        for (i in 0..rows - it.second - 1 step it.second) {
            right = (right + it.first) % cols
            if (map[i + it.second][right] == '#') {
                trees++
            }
        }
        total = total * trees
    }
    println("total: $total")
}


//part1()
part2()