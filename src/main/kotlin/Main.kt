import kotlin.math.sqrt
fun main(args: Array<String>) {
    // 1 задание
    fun printFullName (firstName:String, lastName:String) {
        println("$firstName" + " " + "$lastName")
    }
    // 2 задание
    printFullName(firstName = "Виталий", lastName = "Кульбед")
    // 4 задание
    fun calculateFullName(fullName:String, nameLength: Int): Pair<String, Int> {
        return Pair(fullName, nameLength)
    }
    // 3 задание
    val fullName = calculateFullName(fullName = "Виталий Кульбед", nameLength = "Виталий Кульбед".length)
    println(fullName)

    // 5 задание
    fun divisible(number: Int, divider: Int): Boolean {
        return number % divider == 0
    }
    fun Prime(number: Int): Boolean {
        if (number < 0) {
            return false
        }
        if (number <= 1) {
            return false
        }

        val doubleNumber = number.toDouble()
        val root = (sqrt(doubleNumber)).toInt()
        for (divider in 2..root) {
            if (divisible(number, divider)) {
                return false
            }
        }
        return true
    }
    println(Prime(1))
    println(Prime(9))


    // 6 задание
    fun fibonachi(number: Int): Int {
        if (number <= 0) {
            return 0
        }
        if (number == 1 || number == 2) {
            return 1
        }
        return fibonachi(number - 1) + fibonachi(number - 2)
    }

    println(fibonachi(5))
    println(fibonachi(6))
    println(fibonachi(7))
    println(fibonachi(8))
    println(fibonachi(9))
}