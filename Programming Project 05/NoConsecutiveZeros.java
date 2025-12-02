/********************************************
*	DEVELOPER:	Liam Walker
* COLLABORATORS: <name of peer, tutor, instructor>
*	COURSE:	CS226 Discrete Structures
*	PROJECT:	5
*	LAST MODIFIED:	11/24/25
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
import java.util.*;


class MyProgram 
{
	/*********************************************
	*	MAIN PROGRAM:
	*********************************************/
  // Recursive function to list all moves

 

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // change this to any length you want
        List<String> result = new ArrayList<>();
        generate("", n, result);
        
        for (String s : result) {
            System.out.println(s);
        }
    }

    // Recursive generator
    static void generate(String prefix, int n, List<String> result) {
        if (prefix.length() == n) {
            result.add(prefix);
            return;
        }

        // Always allowed to place '1'
        generate(prefix + "1", n, result);

        // Allowed to place '0' only if the last char is not '0'
        if (prefix.isEmpty() || prefix.charAt(prefix.length() - 1) != '0') {
            generate(prefix + "0", n, result);
        }
    }

    

    
    
}