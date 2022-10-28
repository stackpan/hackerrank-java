/**
 * Challenge name: Java Output Formatting
 * Challenge URL: https://www.hackerrank.com/challenges/java-output-formatting/problem
 */

package a_introduction;

import java.util.*;

public class A5_JavaOutputFormatting {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* The solution */
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        String[] input3 = scanner.nextLine().split(" ");

        System.out.printf("================================%n");
        System.out.printf("%-15s%03d%n", input1[0], Integer.parseInt(input1[1]));
        System.out.printf("%-15s%03d%n", input2[0], Integer.parseInt(input2[1]));
        System.out.printf("%-15s%03d%n", input3[0], Integer.parseInt(input3[1]));
        System.out.printf("================================%n");
        /* End of the solution */
    }
}
