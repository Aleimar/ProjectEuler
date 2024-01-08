/**
 * Prime Numbers notes:
 * 2 is the only even prime number.
 */


public class Solution {

    // Main method of class Solution
    public static void main(String[] args) {

        // Create an instance of Solution class (Encapsulation)
        Solution sol = new Solution();

        int counter = 2;            // Initially set the first 2 prime numbers (2,3). This is our prime counter.
        int final_answer = 3;       // Initally set 3 as the highest prime number
        int currentPrime = 3;       // Initially set 3 as the latest prime number found

        boolean flag = false;       // Initally set flag as false

        // Loop while prime counter is less than 10001
        while(counter<=10001) {

            // Check if latest prime is indeed a prime
            flag = sol.checkPrime(currentPrime);

            // In cases where latest prime is a prime
            if(flag) {

                // Update final answer with current prime found.
                final_answer = currentPrime;
                // Update number of primes found
                counter++;
                // Add current prime by 2. 2 because no prime number except 2 is even.
                currentPrime= currentPrime +2;
            }
            else {
                // In cases that the latest prime is not a prime, update with the next odd number.
                currentPrime = currentPrime +2;
            }
        }

        // Stop the loop and display the last prime number found.
        System.out.println("The 10,001st prime number is " + final_answer + ".");

    }



    // Method checkPrime receives an integer number and returns true if its prime, otherwise false.
    public boolean checkPrime(int number) {

        // Check if we can find any integer from 2->n-1 that would be divisible with number
        for(int i=2; i<number; i++) {
            if(number%i == 0) {
                return false;       // If we found a divisible, then its not prime
            }
        }

        // If we cant find any divisible, then its prime
        return true;
    }


}