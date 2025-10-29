/********************************************
*	DEVELOPER:	Liam
*	COURSE:	CS226 Discrete Structures
*	PROJECT:	<project 2>
*	LAST MODIFIED:	10/28/2025
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


class MyProgram 
{
	/*********************************************
	*	MAIN PROGRAM:
	*********************************************/
  public static void main(String[] args) 
	{
	    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.print("Repetition allowed? (true/false): ");
        boolean repetition = sc.nextBoolean();
        System.out.print("Order matters? (true/false): ");
        boolean order = sc.nextBoolean();

        long result;
        if (order && repetition)
            result = (long)Math.pow(n, r);                      // permutations with repetition
        else if (order)
            result = factorial(n) / factorial(n - r);           // permutations without repetition
        else if (repetition)
            result = combination(n + r - 1, r);                 // combinations with repetition
        else
            result = combination(n, r);                         // combinations without repetition

        System.out.println("Result: " + result);
    }

    static long factorial(int x) {
        long f = 1;
        for (int i = 2; i <= x; i++) f *= i;
        return f;
    }

    static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}