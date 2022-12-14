/**
 * Challenge name: Java Datatypes
 * Challenge URL: https://www.hackerrank.com/challenges/java-datatypes/problem
 */

package a_introduction;

import java.util.Scanner;

public class A8_JavaDatatypes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* The solution */
            Scanner scanner = new Scanner(System.in);

            int testCase = Integer.parseInt(scanner.nextLine());
            while (testCase > 0) {
                String testNumber = scanner.nextLine();

                try {
                    long testNumberLong = Long.parseLong(testNumber);

                    System.out.println(testNumber + " can be fitted in:");
                    if (testNumberLong >= Byte.MIN_VALUE && testNumberLong <= Byte.MAX_VALUE) System.out.println("* byte");
                    if (testNumberLong >= Short.MIN_VALUE && testNumberLong <= Short.MAX_VALUE) System.out.println("* short");
                    if (testNumberLong >= Integer.MIN_VALUE && testNumberLong <= Integer.MAX_VALUE) System.out.println("* int");
                    System.out.println("* long");
                } catch (NumberFormatException exception) {
                    System.out.println(testNumber + " can't be fitted anywhere.");
                }

                testCase--;
            }
        /* End of the solution */
    }
}
