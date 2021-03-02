@file:JvmName("PyramidGenerator")

package patterns

fun generateHalfPyramid(base: Int) {
    for (i in 0 until base) {
        for (j in 0 until i + 1) {
            print("*")
        }
        println()
    }
}

fun generatePyramid(base: Int) {
    for (i in 0 until base) {
        for (j in 0 until base - i) {
            print(" ")
        }
        for (k in 0 until i + 1) {
            print(" *")
        }
        println()
    }
}
