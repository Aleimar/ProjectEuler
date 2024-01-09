/**
*  NOTE: Scala doesn't return error in numeric overflow (declared int but should be long);
**/

// Creating Solution object
object Solution {

    // Store the 1k digits here
    val probDigits: String = """
                        7316717653133062491922511967442657474235534919493496983
                        5203127745063262395783180169848018694788518438586156078
                        9112949495459501737958331952853208805511125406987471585
                        2386305071569329096329522744304355766896648950445244523
                        1617318564030987111217223831136222989342338030813533627
                        6614282806444486645238749303589072962904915604407723907
                        1381051585930796086670172427121883998797908792274921901
                        6997208880937766572733300105336788122023542180975125454
                        0594752243525849077116705560136048395864467063244157221
                        5539753697817977846174064955149290862569321978468622482
                        8397224137565705605749026140797296865241453510047482166
                        3704844031998900088952434506585412275886668811642717147
                        9924442928230863465674813919123162824586178664583591245
                        6652947654568284891288314260769004224219022671055626321
                        1111093705442175069416589604080719840385096245544436298
                        1230987879927244284909188845801561660979191338754992005
                        2406368991256071760605886116467109405077541002256983155
                        2000559357297257163626956188267042825248360082325753042
                        0752963450""".stripMargin.replaceAll("\\s", "")     // Replace new lines, tabs, spaces with empty

    
    // Main method
    def main(args: Array[String]): Unit = {

        // Call helper function, initially set start and end index as 0 and 13, and greatest product as 0. 
        // Additionally set 13 adjacent digits as empty string
        helper(0,13,0, "");

    }


    // helper is a recursive function that calculates the product of adjacent numbers.
    def helper(start: Int, end: Int, greatestProd: Long, greatestSub: String): Unit = {

        var subDigits : String = "";            // Initially set subdigits to be calculated as empty string
        var currentProd : Long = 1;             // Initially set the product of current subdigits as 1


        // In cases where the end index is within 1000
        if(end <= 1000) {

            // Assign subDigits as the substring from start to end-1 index
            subDigits= probDigits.substring(start, end);

            // Optimization: If we found substring to have 0; skip and proceed to next start and end indexes.
            if (subDigits.contains("0")) {
                helper(start+1, end+1, greatestProd, greatestSub);
            }
            else {

                // Loop each character in subDigits
                for (char <- subDigits) {

                    // Convert each character to int and update product of substring.
                    currentProd =  currentProd * char.asDigit;
                }

                // If current calculated product is greater than recorded greatest product,
                if(currentProd > greatestProd) {

                    // Call helper and start from next index and end in the next end index, 
                    // and set greatest product as the current product. Update the 13 adjacent digits.
                    helper(start+1, end+1, currentProd, subDigits);
                }
                else {
                    // Call helper and start from next index and end in the next end index
                    helper(start+1, end+1, greatestProd, greatestSub);
                }
            }

        }
        else {
            // Once we reached the max possible end index, display the greatest product.
            println("The thirteen adjacent digits with the greatest product is " + greatestSub + ".");
            println("The value of the product is "+ greatestProd + ".");
        }

    }
}