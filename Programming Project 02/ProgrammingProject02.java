/********************************************
*	DEVELOPER:	Liam
*	COURSE:	CS226 Discrete Structures
*	PROJECT:	<project 2>
*	LAST MODIFIED:	09/30/2025
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
import java.util.*;


class MyProgram 
{
	/*********************************************
	*	MAIN PROGRAM:
	*********************************************/
  public static void main(String[] args) 
	{
    Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int sheets = (n + 3) / 4;  // 4 pages per sheet
            int totalPages = sheets * 4;

            // Fill pages list with real pages and 0s for blanks
            int[] pages = new int[totalPages];
            for (int i = 0; i < totalPages; i++) {
                if (i < n) pages[i] = i + 1;
                else pages[i] = 0;
            }

            // Build booklet order
            List<String> result = new ArrayList<>();
            int left = totalPages - 1;
            int right = 0;

            for (int i = 0; i < sheets; i++) {
                int A = pages[left--];
                int B = pages[right++];
                int C = pages[right++];
                int D = pages[left--];

                result.add(A + "," + B + "," + C + "," + D);
            }

            // Print output
            System.out.print(sheets + ": ");
            for (int i = 0; i < result.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(result.get(i));
            }
            System.out.println();
        }
        sc.close();
  }

	/*********************************************
	*	STATIC METHODS:
	*********************************************/
	/**DESCRIPTION: <method description> */
	//<method definition>
}