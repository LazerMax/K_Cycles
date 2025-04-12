import kotlin.math.abs

fun main() {

    print("Введите число: ")
    var number = readln().toIntOrNull()?.let { abs(it) }
    var kol_chet = 0
    var kol_nechet = 0;

    if (number != null){
        while (number > 0){
            val tmp = number % 10
            if (tmp % 2 == 0){
                kol_chet += 1
            } else {
                kol_nechet += 1
            }
            number /= 10
        }
        println("Количество чётных цифр: $kol_chet, количество нечётных цифр: $kol_nechet")
    }
    else {
        println("Некорректный ввод. Введите число.")
    }
}