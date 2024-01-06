/**  Comment: 
 I am not really a fan of scripting languages but I code JavaScript and Python for a living >//<

 This problem is also solved using brute-force, I dont think this is the best way. I might need to read more on 
 dynamic programming or number theory to find better solution.
**/


/**
 * isNotEvenlyDivisible function checks if the number n is not evenly divisible from 1-20
 * 
 * @param {integer} n - The number for checking whether divisible from 1-19
 * @returns {boolean} Whether its not evenly divisible or not
 */
function isNotEvenlyDivisible(n) {
    
    // We loop from 2-19 (since the number passed will always be divisible by 20 & 1)
    for(let i=2; i<20; i++) {
        
        // If we found a number that is not divisible
        if(n%i != 0) {

            // proceed
            return true;
        }
    }

    // stop
    return false;
}


var answer = 20;    // Initially set 20 as the solution

// Initially set multiplier as 2 where we will multiply answer (20) by the updated multiplier
var multiplier = 2; 

var flag = true;    // Flag determines whether we found the final answer or not; Initially true meaning solution is not yet final.

// While flag is still true (or solution is not found)
while(flag) {
    
    multiplier++;   // Increment multiplier by 1

    // Update flag whether we current multiplier * 20 is evenly divisible
    flag = isNotEvenlyDivisible(multiplier*answer)
}

console.log("The final answer is: " + answer*multiplier)