@file:JvmName("SquareGenerator")

package patterns

fun generateSquare(base: Int) {
    for (i in 0 until base) {
        for (j in 0 until base) {
            print(" *")
        }
        println()
    }
}

fun generateVerticalOrderedSquare(base: Int) {
    for (i in 0 until base) {
        for (j in 0 until base) {
            System.out.printf(" %d", i + 1)
        }
        println()
    }
}

fun generateHorizontalOrderedSquare(base: Int) {
    for (i in 0 until base) {
        for (j in 0 until base) {
            System.out.printf(" %d", j + 1)
        }
        println()
    }
}

fun generateCharSquare(base: Int) {
    for (i in 0 until base) {
        for (c in 'A'.toInt() until 'A'.toInt() + base) {
            System.out.printf(" %c", c)
        }
        println()
    }
}

fun generateCharSquareOrderedHorizontally(base: Int) {
    generateCharSquare(base)
}

fun generateCharSquareOrderedVertically(base: Int) {
    for (c in 'A'.toInt() until 'A'.toInt() + base) {
        for (i in 0 until base) {
            System.out.printf(" %c", c)
        }
        println()
    }
}

fun generateCharSquareReversedHorizontally(base: Int) {
    for (i in 0 until base) {
        val start = ('A'.toInt() + base - 1).toChar()
        var c = start
        while (c >= 'A') {
            System.out.printf(" %c", c)
            c--
        }
        println()
    }
}

fun generateCharSquareReversedVertically(base: Int) {
    val start = ('A'.toInt() + base - 1).toChar()
    var c = start
    while (c >= 'A') {
        for (i in 0 until base) {
            System.out.printf(" %c", c)
        }
        println()
        c--
    }
}

fun generateNumericSquareWithEnumerationStartWithOne(base: Int) {
    var increment = 0
    for (i in 0 until base) {
        for (j in 0 until base) {
            System.out.printf(" %2d", j + 1 + increment * base)
        }
        increment += 1
        println()
    }
}

fun generateNumericSquareWithEnumerationStartWithOne(base: Int, step: Int) {
    var increment = 0
    for (i in 0 until base) {
        for (j in 0 until base) {
            System.out.printf(" %2d", increment + 1)
            increment += step
        }
        println()
    }
}

fun generateNumericSquareWithEnumerationStartWithStepValue(base: Int, step: Int) {
    var increment = 2
    for (i in 0 until base) {
        for (j in 0 until base) {
            System.out.printf(" %2d", increment)
            increment += step
        }
        println()
    }
}

fun generateNumericSquareEnumeratesWithRowIndex(base: Int) {
    for (i in 0 until base) {
        for (j in 0 until base) {
            System.out.printf(" %2d", (j + 1) * (i + 1))
        }
        println()
    }
}

fun generateNumericSquareOrderedVertically(base: Int) {
    for (i in 0 until base) {
        for (j in 0 until base) {
            System.out.printf(" %d", i + 1)
        }
        println()
    }
}

fun generateNumericSquareOrderedVerticallyWhenColumnIndexIsOdd(base: Int) {
    for (i in 0 until base) {
        val incrementerA = i + 1
        var incrementerB = 1
        for (j in 0 until base) {
            if (j % 2 == 0) System.out.printf(" %d", incrementerA) else {
                System.out.printf(" %d", incrementerB)
                incrementerB += 1
            }
        }
        println()
    }
}

fun generateNumericSquareOrderedVerticallyWhenColumnIndexIsEven(base: Int) {
    for (i in 0 until base) {
        val incrementerA = i + 1
        var incrementerB = 1
        for (j in 0 until base) {
            if (j % 2 == 1) System.out.printf(" %d", incrementerA) else {
                System.out.printf(" %d", incrementerB)
                incrementerB += 1
            }
        }
        println()
    }

}

fun generateNumericSquareOrderVerticallyInZigZagFashionStartFromTop(base: Int) {
    for (i in 0 until base) {
        for (j in 0 until base) {
            print(" %2d".format(i + 1 + base * j))
        }
        println()
    }
}

fun generateNumericSquareOrderVerticallyInZigZagFashionStartFromBottom(base: Int) {
    for (i in base downTo 1) {
        for (j in 0 until base) {
            print(" %2d".format(i + base * j))
        }
        println()
    }
}


fun generateNumericSquareOrderedVerticallyInSnakeFactionStartFromTop(base: Int) {
    repeat(base) { i ->
        repeat(base) { j ->
            if (j % 2 == 0) {
                print(" %2d".format(i + 1 + j * base))
            } else {
                print(" %2d".format(((j + 1) * base) - i))
            }
        }
        println()
    }
}

fun generateNumericSquareOrderedVerticallyInSnakeFactionStartFromBottom(base: Int) {
    repeat(base) { i ->
        repeat(base) { j ->
            if (j % 2 == 0) {
                print(" %2d".format((base * (j + 1)) - i))
            } else {
                print(" %2d".format((base * j) + (i + 1)))
            }
        }
        println()
    }
}

fun generateNumericSquareThatIncrementsRowOrderingByOne(base: Int) {
    repeat(base) { i ->
        repeat(base) { j ->
            print(" %2d".format((j + 1) + i))
        }
        println()
    }
}

@JvmOverloads
fun generateNumericSquareThatIncrementsRowOrderingByStep(base: Int, step: Int = 1) {
    var rowCounter = 0
    repeat(base) {
        var columnCounter = 1
        repeat(base) {
            print(" %2d".format(columnCounter + rowCounter))
            columnCounter += step
        }
        rowCounter += step
        println()
    }
}
