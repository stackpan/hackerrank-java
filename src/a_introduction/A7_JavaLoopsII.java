/**
 * Challenge name: Java Loops II
 * Challenge URL: https://www.hackerrank.com/challenges/java-loops/problem
 */

package a_introduction;

import java.io.*;
import java.util.*;

public class A7_JavaLoopsII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* The solution */
        Scanner scanner = new Scanner(System.in);

        int q = Integer.parseInt(scanner.nextLine());

        int[] a = new int[q];
        int[] b = new int[q];
        int[] n = new int[q];

        for (int i = 0; i < q; i++) {
            String[] qInput = scanner.nextLine().split(" ");

            a[i] = Integer.parseInt(qInput[0]);
            b[i] = Integer.parseInt(qInput[1]);
            n[i] = Integer.parseInt(qInput[2]);
        }

        String[] qResults = new String[q];

        for (int i = 0; i < q; i++) {
            StringJoiner stringJoiner = new StringJoiner(" ");
            for (int j = 0; j < n[i]; j++) {
                int result = a[i];
                for (int k = 0; k <= j; k++) {
                    result += (int) Math.pow(2, k) * b[i];

                }
                stringJoiner.add(Integer.toString(result));
            }
            qResults[i] = stringJoiner.toString();
        }

        for (String qResult : qResults) {
            System.out.println(qResult);
        }
        /* End of the solution */
    }
}
