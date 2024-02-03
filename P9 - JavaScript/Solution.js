// I tried to figure out how to solve this using Euclid Proof but I seem to have trouble with understanding the proof.

// This solution is implemented using brute force
/**
 * checkTriplet function returns True of a^2+b^2 = c^2
 * 
 * @param {integer} a
 * @param {integer} b 
 * @param {integer} c 
 * @returns {boolean} 
 */

function checkTriplet(a, b, c) {
    return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2);
}


// Loop from 1-1000
for(let c=1; c< 1000; c++) {
    // Loop from 0 - c to make sure that c > b
    for(let b=0; b<c; b ++ ) {
        // Loop from 0 - b to make sure that b > a
        for(let a=0; a<b; a ++) {

            // Check if a+b+c is 1000
            if(a+b+c == 1000){

                // Check if a, b, c is a pythagorean triplet
                if(checkTriplet(a, b, c)) {

                    console.log("Triplet: ",a, " ", b, " ",c);
                    console.log("Final Answer: ", a*b*c);       // Display solution
                }
            }
        }
    }
}




