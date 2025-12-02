/********************************************
*	DEVELOPER:	<your name>
* COLLABORATORS: <name of peer, tutor, instructor>
*	COURSE:	CS226 Discrete Structures
*	PROJECT:	<project #>
*	LAST MODIFIED:	<date of last change>
********************************************/
/********************************************
*	<TITLE OF PROGRAM>
*********************************************
*	PROGRAM DESCRIPTION:
*	<1-2 sentences describing overall program>
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
    public static void solveHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromPeg + " to " + toPeg);
            return;
        }

        // Move n−1 disks to auxiliary peg
        solveHanoi(n - 1, fromPeg, auxPeg, toPeg);

        // Move the largest disk
        System.out.println("Move disk " + n + " from " + fromPeg + " to " + toPeg);

        // Move n−1 disks from auxiliary peg to destination
        solveHanoi(n - 1, auxPeg, toPeg, fromPeg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = scanner.nextInt();

        System.out.println("\nSolution:");
        solveHanoi(n, 'A', 'C', 'B');  // A = source, C = destination, B = auxiliary
    }

	/*********************************************
	*	STATIC METHODS:
	*********************************************/
	/**DESCRIPTION: <method description> */
	//<method definition>
}