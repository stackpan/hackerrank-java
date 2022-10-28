/**
 * Challenge name: Java Loops I
 * Challenge URL: https://www.hackerrank.com/challenges/java-loops-i/problem
 */

package a_introduction;

import java.io.*;

public class A6_JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        /* The solution */
        for (int i = 1; i <= 10; i++) System.out.println(N + " x " + i + " = " + (i * N));
        /* End of the solution */
    }
}
