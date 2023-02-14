fun main(){
    println("Введите целое положительное число: ")
    var num = readLine().toString().toInt()
    if (num < 0){
        println("Вы ввели отрицательное число")
        return
    }
    var factor = 1
    for (i in 1..num){
        factor*=i
    }
    println("Факториал числа $num = $factor")
}