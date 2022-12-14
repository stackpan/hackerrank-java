/**
 * Challenge name: Java Static Initializer Block
 * Challenge URL: https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */

package a_introduction;

import java.util.Scanner;

public class A10_StaticInitializerBlock {

    /* The solution */
    public static int zeroLimit = 0;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (b <= zeroLimit || h <= zeroLimit) System.out.println("java.lang.Exception: Breadth and height must be positive");
        else System.out.println(b * h);
        /* End of the solution */
    }
}
