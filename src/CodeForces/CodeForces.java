/* package codechef; // don't place package name! */

import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeForces
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.ready()){int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T ; t++) {
                String inputs[] = br.readLine().split(" ");
                int A = Integer.parseInt(inputs[0]);
                int B = Integer.parseInt(inputs[1]);
                if(B == 1){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    BigInteger y = BigInteger.valueOf(A).multiply(BigInteger.valueOf(B));
                    BigInteger z = BigInteger.valueOf(A).multiply(BigInteger.valueOf(B+1));
                    StringBuffer ans = new StringBuffer();
                    ans.append(A);
                    ans.append(" ");
                    ans.append(y);
                    ans.append(" ");
                    ans.append(z);
                    System.out.println(ans.toString());
                }
            }
        }
    }

    // private static int findGCD(int i, int j, Map<Integer, Integer> myMap) {
    //     int gcd = findGCDUtil(i,j);
    //     if(gcd > 1){
    //         return 1;
    //     }
    //     return 0;
    // }

    // private static int findGCDUtil(int i, int j) {
    //     if(j == 0){
    //         return i;
    //     }
    //     return findGCDUtil(j, i%j);
    // }
}
