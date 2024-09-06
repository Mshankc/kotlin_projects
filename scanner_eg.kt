fun calc(x: Int, y: Int, lmd: (Int, Int) -> Int): Int {  // Corrected parameter type and name
    return lmd(x, y)  // Return the result of the lambda function
}

fun main() {
    val add = { x: Int, y: Int -> x + y }  // Lambda for addition
    val sub = { x: Int, y: Int -> x - y }  // Lambda for subtraction

    print("Enter 1st number: ")
    val num1 = readLine()?.toIntOrNull() ?: return println("Invalid Input")

    print("Enter 2nd number: ")
    val num2 = readLine()?.toIntOrNull() ?: return println("Invalid Input")

    print("Enter 'add' or 'sub': ")
    val op: String? = readLine()

    // Choose the appropriate lambda function based on user input
    val result: Int = when (op) {
        "add" -> calc(num1, num2, add)  // Use the 'add' lambda
        "sub" -> calc(num1, num2, sub)  // Use the 'sub' lambda
        else -> return println("Invalid operation!")  // Handle invalid input
    }

    println("Result = $result")
}
