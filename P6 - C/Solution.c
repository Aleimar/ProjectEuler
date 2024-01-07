#include <stdio.h>
#include <math.h>

// Function getSumSquare calculates and returns the sum of squares from 1-limit 
long getSumSquare(long limit) {

    long sumSquare = 0;         // Initially set sum of squares as 0

    // Loop from 1-limit
    for(int i=1; i <=limit; i++) {

        // Update sumSquare as current sumSquare + square of current value (i)
        sumSquare = sumSquare + pow(i, 2);      
    }


    // Return the calculated result
    return sumSquare;
}

// Function getSquareSum calculates and returns the square of sum from 1-limit
long getSquareSum(long limit) {

    long squareSum = 0;         //Initally set the square of sum as 0;

    // For each number from 1-limit
    for(int i=1; i<=limit; i++) {

        // Add the values and updates square of sum
        squareSum = squareSum + i;
    }    
    
    // Return the square of sum
    return pow(squareSum, 2);
}

// Main function
int main() {

    int limit = 100;        // Limit 100 as problem requirement

    long sumSquare = getSumSquare(limit);   // Calculate the sum of squares using getSumSquare
    long squareSum = getSquareSum(limit);   // Calculate the square of sum using getSquareSum

    long final_answer = squareSum - sumSquare;  // Subtract square of sum by sum of square

    // Display final answer.
    printf("The difference is %ld. \n", final_answer);
    return 0;
}