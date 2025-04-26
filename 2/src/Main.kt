import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 9) // Генерация случайного числа от 1 до 9

    println("Я загадал число от 1 до 9. Попробуйте угадать!")

    while (true) {
        print("Введите ваше предположение: ")
        val playerGuess = readln().toIntOrNull()

        if (playerGuess == null) {
            println("Некорректный ввод. Пожалуйста, введите число от 1 до 9.")
            continue // Переход к следующей итерации цикла
        }

        if (playerGuess == randomNumber) {
            println("Поздравляю! Вы угадали мое число: $randomNumber")
            break // Выход из цикла
        } else {
            println("Не угадали. Попробуйте еще раз.")
        }
    }
}
