#!/usr/bin/env kotlin

//INCLUDE ../util/util.kts

fun part1() {
    val input = readLines("input.txt")
    var counter = 0

    for (line in input) {
        val split = line.split(":")
        val part1 = split[0].split(" ")
        val occurances = part1[0]
        val min = occurances.split("-")[0].toInt()
        val max = occurances.split("-")[1].toInt()
        val character = part1[1].single()
        val password = split[1].trim()

        val count = password.filter { it == character }.count()
        if (count >= min && count <= max) {
            counter++
        }
    }
    println(counter)
}

fun part2() {
    val input = readLines("input.txt")
    var counter = 0

    for (line in input) {
        val split = line.split(":")
        val part1 = split[0].split(" ")
        val occurances = part1[0]
        val min = occurances.split("-")[0].toInt()
        val max = occurances.split("-")[1].toInt()
        val character = part1[1].single()
        val password = split[1].trim()

        val position1 = password.get(min-1)
        val position2 = password.get(max-1)

        if ((position1 == character) xor (position2 == character)) {
            counter++
        }
    }
    println(counter)
}

part1()
part2()