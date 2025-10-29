/********************************************
*	DEVELOPER:	Liam
*	COURSE:	CS226 Discrete Structures
*	PROJECT:	<project 3>
*	LAST MODIFIED:	10/30/2025
********************************************/
/********************************************
*	Unary Number
*********************************************
*	PROGRAM DESCRIPTION:
*	Reads a sequence of positive integers (1 ≤ n ≤ 76), one per line, until the end of input. Converts each integer to its unary representation. Outputs the original number followed by a space and then its unary form.
*********************************************
*	STATIC METHODS:
* <list methods UML diagram style>
*********************************************/

/*********************************************
*	ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
*********************************************/
import java.util.Scanner; //to get user input
import java.util.ArrayList; // to create an array


class MyProgram 
{
	/*********************************************
	*	MAIN PROGRAM:
	*********************************************/
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int number = 0;

        do {
            System.out.print("Please enter a positive number: ");
            number = input.nextInt();

        } while (number < 0);

        primeFactors(number);
  }

	public static void primeFactors(int number)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Print the number of 2s that divide n
        while (number % 2 == 0) {
            list.add(2);
            number /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // While i divides n, print i and divide n
            while (number % i == 0) {
                list.add(i);
                number /= i;
            }
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (number > 2) {
            list.add(number);
        }

        //Print out array
        System.out.println("Prime Factors of " + number + ": ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n");

        //If array is empty the number has no prime factorizations meaning it is prime
        if(list.size() <= 1) {
            System.out.println("This number is a prime.");
        } else {
            System.out.println("This number is composite.");
        }


    }
	
}