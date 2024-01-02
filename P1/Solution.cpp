#include <iostream>
using namespace std;

int main() {

    //declare a variable sum_3_5 where we will store the final answer. set it initially to 0.
    int sum_3_5=0;

    //loop each number from 0-999 (or <1000)
    for(int i=0; i<1000; i++){

        //check if the number is a modulo of 3 or modulo of 5
        //->in a%b, modulo would return 0 if a/b returns no remainder, thus b is a multiple of a.
        if(i%3==0 or i%5==0){

            // if the number is a multiple of 3 or 5, add it the variable sum_3_5.
            sum_3_5= sum_3_5+i;
        }
    }

    //show the answer
    cout << "The sum of all multiples of 3 or 5 below 1000 is " << sum_3_5 << ".";

    return 0;
}

// How to run a cpp file in Mac
// clang++ -o Solution Solution.cpp -- where foo is a pro
// ./Solution