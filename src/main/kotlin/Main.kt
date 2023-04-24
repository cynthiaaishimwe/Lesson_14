fun main() {
    var myList = listOf(1, 2, 3, 4, 5)
    var result = productOfList(myList)
    println(result)

    var firstNumbers = listOf(10,56,34,10,67,10,2)
    var newNumbers = numbers(firstNumbers)
    println(newNumbers)

    val myString = "Good morning"
    val output= countVowels(myString)
    println(output)

    var myArray = arrayOf(1, 2, 3, 4, 5)
    var newSum = sumArray(myArray)
    println(newSum)

}
//    Write a function that takes a list of integers as a parameter and
//    returns the product of all the elements.
fun productOfList(lst: List<Int>): Int {
    var product = 1
    for (num in lst) {
        product *= num
    }
    return product
}
//Write a function that takes a list of integers as a parameter
//and returns a new list with all the duplicates removed.
fun numbers(nums: List<Int>): List<Int>{
    val new = nums.distinct()
    return new
}
//Write a function that takes a string as a parameter and
//returns the number of vowels in the string.kotlin
fun countVowels(str: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (char in str) {
        if (char in vowels) {
            count++
        }
    }
    return count
}

//Write a function that takes an array of integers as a parameter and
//returns the sum of all the elements.
fun sumArray(arr: Array<Int>): Int {
    var sum = 0
    for (num in arr) {
        sum += num
    }
    return sum
}
