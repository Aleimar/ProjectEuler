
def fibo(prevValue, currentValue):
    '''Fibo takes two values, the previous and the current then returns the value of 
    the next fibonacci sequence'''
    return prevValue+currentValue


def main():
    '''Main function and the solution.'''
    
    prevValue = 1       # initially set the previous sequence value as 1
    currentValue= 1     # initially set the current sequence value as 1
    answer = 0          # initially set the sum as 0

    # continuously loop while latest sequence value is less than 4,000,000
    while currentValue < 4000000:

        # check if the latest sequence value is even.
        if(currentValue%2 == 0):

            # add current sequence value to the sum of even values.
            answer = answer + currentValue

        # display the sequence generated
        print(currentValue, end=", ")

        # temporarily remember the latest value in the sequence
        tmpCurrent=currentValue

        # calculate next value in the fibonaccio sequence and store it as the current value
        currentValue=fibo(prevValue, currentValue)
        
        # now, the previous value would be the previous current value of the sequence
        prevValue= tmpCurrent 



    print("\nThe sum of the even-valued terms is ", answer)
        
        

# start of the program
if __name__ == "__main__":
    main()