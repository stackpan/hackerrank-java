/**
 * Challenge name: Java End-of-file
 * Challenge URL: https://www.hackerrank.com/challenges/java-end-of-file/problem
 */

package a_introduction;

import java.util.Scanner;

public class A9_JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* The solution */
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (scanner.hasNext()) {
            System.out.println(++counter + " " + scanner.nextLine());
        }
        /* End of the solution */
    }
}
