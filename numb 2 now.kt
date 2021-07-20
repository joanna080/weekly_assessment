fun main(args: Array<String>) {
    var numb = 1234
    var reversed = 0

    while (numb != 0) {
        val digit = numb % 10
        reversed = reversed * 10 + digit
        numb /= 10
    }

    println("Reversed Number: $reversed")
}