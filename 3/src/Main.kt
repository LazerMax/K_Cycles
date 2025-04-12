fun main() {
    print("Введите положительное число: ")
    val number = readln().toIntOrNull()

    if (number != null && number > 0) {
        for (i in 1 .. number){
            if (number % i == 0 && i != number){
                print("$i,")
            } else if (i == number){
                print(number)
            }
        }
    } else {
        println("Некорректный ввод. Введите положительное число.")
    }
}