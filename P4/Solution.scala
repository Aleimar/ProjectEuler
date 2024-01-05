// Creating Solution object
object Solution {


    // declaring global factors 999 * 999 which is the maximum 3-digit numbers
    val aVal: Int = 999
    val bVal: Int = 999


    // Main method
    def main(args: Array[String]): Unit = {

        // Call helper function and set a=999,b=999;
        // hihestPalindrome=0, highest factor A =0, and highest factor B=0
        helper(Solution.aVal, Solution.bVal, 0, 0, 0)

    }

    // A recursive function that takes factors a & b, the highest palindrome product recorded,
    // and the factors of the highest palindrome
    def helper(a: Int, b: Int, highestPalindrome: Int,  aHighest: Int, bHighest: Int) : Unit = {

        // Local variables to store the current higest palindrome and its factors
        var updatedHighestPalindrome = highestPalindrome
        var updatedAHighest = aHighest
        var updatedBHighest = bHighest

        // Calculate the product of factors a and b
        var product = calculateProduct(a, b)

        // Check if the product of 2 factors is a palindrom
        if(checkIfPalindrome(product)) {
            println("Palindrome found: " + product + " = " + a + " * " + b)     // Display palindromes found and its factors.

            // In cases where product found is higher than the recorded palindrome,
            // update the highest palindrome and factors
            if(updatedHighestPalindrome < product) {
                updatedHighestPalindrome= product
                updatedAHighest = a 
                updatedBHighest = b
            }
        }

        // If palindrome is not found proceed
            
        // While b is greater than the lowest 3-digits number (100)
        if(b>100) {

            // Call the function to recursively assess product of A and B-1 (until B = 100)
            helper(a, b-1, updatedHighestPalindrome, updatedAHighest, updatedBHighest)
        }
        else if(a>100 && b==100) {

            // In cases where B is 100 and A greater than 100,
            // then we need recursively assess the product of A-1 and initial highest factor 999 (until B = 100 and A = 100)
            helper(a-1, Solution.bVal, updatedHighestPalindrome, updatedAHighest, updatedBHighest)
        }
        else {
            // Once A=100 and B=100 (the lowest limit 3 digits factors), then we display the highest recorded palindrome and its factors
            println("Highest Palindrome Product Factors are " + updatedAHighest + " and " + updatedBHighest + " with a palindrome product of " + updatedHighestPalindrome + ".")
        }

    }

    // Function that takes 2 integers and returns their product.
    def calculateProduct(a: Int, b: Int) : Int = {
        val product = a * b

        // Return the product
        product
    }


    // Function takes an integer and returns True if its a palindrome and False if otherwise
    def checkIfPalindrome(c: Int) : Boolean = {

        // Convert Integer to String
        val stringProduct = c.toString();

        // Remember if product has even length; if 0, then string is even length otherwise its odd.
        val isEvenLen = stringProduct.length%2

        var isPalindrome : Boolean = false              // Initially set palindrome flag as false

        // Get the midpoint of the string lenth
        val midpoint: Int = stringProduct.length / 2
            
        // Split the string at midpoint and save it as first and second half
        val (firstHalf: String, secondHalf: String) = stringProduct.splitAt(midpoint)

        // Reverse the half using getReverseHalf function
        val reversedHalf = getReverseHalf(secondHalf, isEvenLen)
        
        // Assign isPalindrome flag if first half is equal to the reverse of second half.
        isPalindrome= firstHalf==reversedHalf
        
        // Return palindrome flag assessment
        isPalindrome
    }


    // Function that takes a string and integer (0,1) and returns the revers of the string
    def getReverseHalf(half : String, excludeFirst: Int) : String = {

        // Variable where reversed string will be stored
        var reversed = ""

        // Check if we need to exclude the first character. If 0 then No, else exclude.
        if(excludeFirst == 0) {
            reversed = half.reverse
        }
        else {
            reversed = half.substring(1).reverse        // For odd length strings, exclude the 1st character of the second half.
        }

        // Return the reversed string
        reversed
    }
}