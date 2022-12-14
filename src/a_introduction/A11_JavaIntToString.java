/**
 * Challenge name: Java Int to String
 * Challenge URL: https://www.hackerrank.com/challenges/java-int-to-string/problem
 */

package a_introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A11_JavaIntToString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        /* The solution */
        Scanner scanner = new Scanner(System.in);

        try {
            scanner.nextInt();
            System.out.println("Good job");
        } catch (InputMismatchException exception) {
            System.out.println("Wrong answer");
        }
        /* End of the solution */
    }
}
