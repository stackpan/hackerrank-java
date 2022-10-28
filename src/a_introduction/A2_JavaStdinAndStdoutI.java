/**
 * Challenge name: Java Stdin and Stdout I
 * https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
 */

package a_introduction;

import java.util.*;

public class A2_JavaStdinAndStdoutI {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* The solution */
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        /* End of the solution */
    }
}