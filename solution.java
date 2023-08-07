/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int maxT = scanner.nextInt();
            int maxN = scanner.nextInt();
            int sumN = scanner.nextInt();
            
            long maxIterations = 0;
            
            for (int i = 1; i <= maxT; i++) {
                int n = Math.min(maxN, sumN);
                maxIterations += (long) n * n;
                sumN -= n;
                if (sumN == 0) {
                    break;
                }
            }
            
            System.out.println(maxIterations);
        }
        
        scanner.close();
    }
}
