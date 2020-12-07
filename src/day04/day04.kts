#!/usr/bin/env kotlin

//INCLUDE ../util/util.kts
val required = listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")
val regexp = listOf(
    """^byr:(19[2-9]\d|200[0-2])$""",
    """^iyr:20(1\d|20)$""",
    """^eyr:20(2\d|30)$""",
    """^hgt:((1([5-8]\d|9[0-3])cm)|((59|6\d|7[0-6])in))$""",
    """^hcl:#[\da-f]{6}$""",
    """^ecl:(amb|blu|brn|gry|grn|hzl|oth)$""",
    """^pid:\d{9}$"""
)

fun part1() {
    val input: String = readText("valid.txt")
    val lines = input.split("\n\n")

    val counts = lines.map {
        countPresent(it, required)
    }.sum()

    println(counts)
}

fun part2() {
    val input: String = readText("input.txt")
    val lines = input.split("\n\n")

    val counts = lines.map {
        isLineValid(it, regexp)
    }.sum()

    println(counts)
}

fun countPresent(line: String, required: List<String>): Int {
    var count = required.filter {
        line.indexOf(it) != -1
    }.size
    return if (count == 7) 1 else 0
}

fun isLineValid(line: String, regexp: List<String>) : Int {
    val split = line.split(" ", "\n")
    var count = 0;
    split.forEach {
        field ->
        count = count + regexp.filter {
            it.toRegex().matches(field)
        }.size
    }
    return if (count == 7) 1 else 0
}

//part1()
part2()