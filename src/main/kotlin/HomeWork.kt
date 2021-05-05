class HomeWork {

    // ფუნქცია აბრუნებს უდიდეს საერთო გამოყოფს
    fun usg(firstNumber: Int, secondNumber: Int): Int {
        var numOne = firstNumber
        var numTwo = secondNumber
        while (numTwo != 0) {
            val t = numTwo
            numTwo = numOne % numTwo
            numOne = t
        }
        return numOne
    }

    //ფუნქცია აბრუნებს უმცირეს საერთო ჯერადს
    fun usj(firstNumber: Int, secondNumber: Int): Int {

        val biggerNum = if (firstNumber > secondNumber) firstNumber else secondNumber
        var usj = biggerNum
        while (true) {

            if (((usj % firstNumber) == 0) && ((usj % secondNumber) == 0)) {
                break
            }
            usj += biggerNum
        }
        return usj

    }

    //ფუნქცია აბრუნებს პასუხს შეიცავს თუ არა სტრინგი "$" სიმბოლოს
    fun charFilter(str: String) {
        if (str.contains("$"))
            println("Looks like we have $")
        else
            println("There is no $")
    }

    //ფუნქცია აბრუნებს შებრუნებულ მთელ რიცხვს
    fun reversedNumber(number: Int): Int {
        var num = number
        var reverse = 0
        while (num != 0) {
            reverse = reverse * 10 + num % 10
            num /= 10
        }
        return reverse
    }

    //რეკუსიული ფუნქცია, აბრუნებს ლუწი რიცხვების ჯამს 100-ის ფარგლებში
    fun evenSum(argNum: Int = 100): Int {
        if (argNum > 100)
            println("$argNum is out of limit")
        return if (argNum / 2 != 1 && argNum <= 100)
            argNum + evenSum(argNum - 2)
        else
            argNum
    }

    //ფუნქცია აბრუნებს პასუხს არის თუ არა მონაცემი პალინდრომი
    fun findPalindrome(str: String) {
        val sb = StringBuilder(str)
        val reverseStr = sb.reverse().toString()
        if (str == reverseStr)
            println("$str is palindrome")
        else
            println("$str isn't palindrome")
    }
}


fun main() {
    val homeWork = HomeWork()
    println(homeWork.usg(80, 10))
    println(homeWork.usj(3, 5))
    homeWork.charFilter("check$")
    println(homeWork.reversedNumber(10220))
    println(homeWork.evenSum())
    homeWork.findPalindrome("tattarrattat")

}