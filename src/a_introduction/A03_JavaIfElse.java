/**
 * Challenge name: Java If-Else
 * Challenge URL: https://www.hackerrank.com/challenges/java-if-else/problem
 */

package a_introduction;

import java.io.*;

public class A03_JavaIfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        /* The solution */
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) System.out.println("Not Weird");
            else if (N >= 6 && N <= 20) System.out.println("Weird");
            else System.out.println("Not Weird");
        }
        /* End of the solution */
    }
}

