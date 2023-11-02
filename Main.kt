import kotlin.text.toInt
import kotlin.text.toInt as toInt1

fun main(args: Array<String>) {
    fun countConsecutiveCharacters(input: String): String {
        if (input.isEmpty()) {
            return ""
        }

        val result = StringBuilder()
        var count = 1

        for (i in 1..<input.length) {
            if (input[i] == input[i - 1]) {
                count++
            } else {
                if (count > 1) {
                    result.append(input[i - 1])
                    result.append(count)
                } else {
                    result.append(input[i - 1])
                }
                count = 1
            }
        }

        if (count > 1) {
            result.append(input[input.length - 1])
            result.append(count)
        } else {
            result.append(input[input.length - 1])
        }

        return result.toString()
    }

    fun main() {
        val input = "AAADSSSRRTTHAAAA"
        val result = countConsecutiveCharacters(input)
        println(result)
    }

    //вторая задача

    fun countUniqueCharacters(input: String) {
        val charCountMap = mutableMapOf<Char, Int>()

        for (char in input) {
            if (charCountMap.containsKey(char)) {
                charCountMap[char] = charCountMap[char]!! + 1
            } else {
                charCountMap[char] = 1
            }
        }

        val sortedEntries = charCountMap.entries.sortedBy { it.key }

        for ((char, count) in sortedEntries) {
            println("$char - $count")
        }
    }

        val input = "AASADDSS"
        countUniqueCharacters(input)

    //третья задача

    print("Введите натуральное число в десятичной системе: ")
    val decimalNumber = readln()

    var binaryNumber = "0"
    var quotient = decimalNumber
    var resultik = quotient.toFloat()

    if (decimalNumber.toInt1() == 0) {
        binaryNumber = "0"
    }
    else {
        while (resultik > 0)
        {
            val remainder = resultik % 2
            binaryNumber = remainder.toString() + binaryNumber
            resultik /= 2
        }
    }

    println("Число $decimalNumber в двоичной системе: $binaryNumber")

    //четвертая задача

    print("Введите два числа и символ операции (например, 2.5 3.0 +): ")
    val inputik = readLine()

    if (inputik != null) {
        val parts = inputik.split(" ")
        if (parts.size == 3) {
            try {
                val number1 = parts[0].toDouble()
                val number2 = parts[1].toDouble()
                val operation = parts[2]

                val result = when (operation) {
                    "+" -> number1 + number2
                    "-" -> number1 - number2
                    "*" -> number1 * number2
                    "/" -> {
                        if (number2 != 0.0) {
                            number1 / number2
                        } else {
                            "Деление на ноль недопустимо"
                        }
                    }
                    else -> "Недопустимая операция"
                }

                println("Результат: $result")
            } catch (e: NumberFormatException) {
                println("Ошибка: Введите корректные числа и операцию.")
            }
        } else {
            println("Ошибка: Введите два числа и символ операции, разделенные пробелами.")
        }
    } else {
        println("Ошибка: Ввод не распознан.")
    }

    //пятая задача

    print("Введите целое число n: ")
    val n = readLine()?.toInt() ?: return

    print("Введите основание степени x: ")
    val x = readLine()?.toInt() ?: return

    var y = 0
    var result = 1

    while (result < n) {
        result *= x
        y++
    }

    if (result == n) {
        println("Целочисленный показатель y = $y")
    } else {
        println("Целочисленный показатель не существует")
    }

    //шестая задача

    println("Введите первое число:")
    val num1 = readLine()?.toIntOrNull()

    println("Введите второе число:")
    val num2 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null && num1 != num2) {
        val sum = num1 + num2
        if (sum % 2 != 0) {
            println("Из введенных чисел можно создать нечетное число: $sum")
        } else {
            println("Создать нечетное число невозможно.")
        }
    } else {
        println("Пожалуйста, введите два различных числа.")
    }

}