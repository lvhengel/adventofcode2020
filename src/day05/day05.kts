#!/usr/bin/env kotlin

//INCLUDE ../util/util.kts

fun part1() {

    val input = readLines("input.txt")
    var highest = 0

    for (line in input) {
        var rows = List(128, { i -> i })
        var cols = List(8, { i -> i })

        var start = 0
        var end = 0

        for (i in 0..7) {
            val char = line.get(i)
            if (char == 'F') {
                start = 0
                end = rows.size / 2
                rows = rows.subList(start, end)
            } else if (char == 'B') {
                start = rows.size / 2
                end = rows.size
                rows = rows.subList(start, end)
            }
        }

        for (i in 7..9) {
            val char = line.get(i)
            if (char == 'L') {
                start = 0
                end = cols.size / 2
                cols = cols.subList(start, end)
            } else if (char == 'R') {
                start = cols.size / 2
                end = cols.size
                cols = cols.subList(start, end)
            }
        }

        val seatId = rows.get(0) * 8 + cols.get(0)

        if (seatId > highest) {
            highest = seatId
        }

        println("highest: $highest")
    }
}

fun part2() {
    val map = Array(128, { IntArray(8) })

    val input = readLines("input.txt")
    var highest = 0

    for (line in input) {
        var rows = List(128, { i -> i })
        var cols = List(8, { i -> i })

        var start = 0
        var end = 0

        for (i in 0..7) {
            val char = line.get(i)
            if (char == 'F') {
                start = 0
                end = rows.size / 2
                rows = rows.subList(start, end)
            } else if (char == 'B') {
                start = rows.size / 2
                end = rows.size
                rows = rows.subList(start, end)
            }
        }

        for (i in 7..9) {
            val char = line.get(i)
            if (char == 'L') {
                start = 0
                end = cols.size / 2
                cols = cols.subList(start, end)
            } else if (char == 'R') {
                start = cols.size / 2
                end = cols.size
                cols = cols.subList(start, end)
            }
        }

        val seatId = rows.get(0) * 8 + cols.get(0)

        map[rows.get(0)][cols.get(0)] = seatId

        if (seatId > highest) {
            highest = seatId
        }


    }

   for (x in 0..127) {
       for (y in 0..7) {
           println(map[x][y])
       }
   }

}


part1()
part2()
