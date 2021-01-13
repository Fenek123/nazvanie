fun main() {
     print("Вас вітає компанія мтс ми щас вас взловаем. ")
     print("Введіть першу цифру")
     var num1 = readLine().toString().toDouble()
     print("введіть другу цифру")
     var num2 = readLine().toString().toDouble()
     var operation = readLine()
// вот я написал
//     if(operation == "+")
//     {
//          println(num1+num2)
//     }
//     if(operation == "-")
//     {
//          println(num1-num2)
//     }
//     if(operation == "*")
//     {
//          println(num1*num2)
//     }
//     if(operation == "/")
//     {
//          println(num1/num2)
//     }
//     else println("ТИ ПОМИЛИВСЯ БРАТАН!!!!!!!"
     when (operation) {
          "+" -> println(num1 + num2)
          "-" -> println(num1 - num2)
          "/" -> println(num1 / num2)
          "*" -> println(num1 * num2)
          else -> println("ТИ ПОМИЛИВСЯ БРАТАН!!!!!!!")
     }























     println("Вас вітає армія України. Плати податки")
     println("Відбувається злом казино. Ви викачано 17 593 гривні з 3000000000 грівні.Продолжіть?\n")
}