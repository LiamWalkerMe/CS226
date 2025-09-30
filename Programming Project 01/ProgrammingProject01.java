/********************************************
*	DEVELOPER:	Liam
*	COURSE:	CS226 Discrete Structures
*	PROJECT:	<project 1>
*	LAST MODIFIED:	08/31/2025
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class MyProgram 
{
	
	public static void main(String[] args) {
        try {
            File file = new File("Unary-SampleInput.txt");
            Scanner sc = new Scanner(file);

            List<String> list = new ArrayList<>();
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
            sc.close();

            // Convert to array with exact size
            String[] arr = list.toArray(new String[0]);

            List<String> output = new ArrayList<>();

            // Print result
            for (String line : arr) {
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(line).append(" ");
                for(int i = 0; i < Integer.parseInt(line) - 1; i++) {
                    stringBuilder.append(1);
                }
                stringBuilder.append(0);
                output.add(stringBuilder.toString());

            }

            
            for (String line : output) {
                System.out.println(line);
            }
            
            

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } 
    }
}