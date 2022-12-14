/**
 * Challenge name: Java Stdin and Stdout II
 * Challenge URL: https://www.hackerrank.com/challenges/java-stdin-stdout/problem
 */

package a_introduction;

import java.util.*;

public class A04_JavaStdinAndStdoutII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* The solution */
        Scanner scanner = new Scanner(System.in);

        int integerInput = Integer.parseInt(scanner.nextLine());
        double doubleInput = Double.parseDouble(scanner.nextLine());
        String stringInput = scanner.nextLine();

        System.out.println("String: " + stringInput);
        System.out.println("Double: " + doubleInput);
        System.out.println("Int: " + integerInput);
        /* End of the solution */
    }
}
