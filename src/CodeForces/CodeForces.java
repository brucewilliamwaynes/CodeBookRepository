/* package codechef; // don't place package name! */

import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeForces
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // if(br.ready()){
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T ; t++) {
                String inputs[] = br.readLine().split(" ");
                int n = Integer.parseInt(inputs[0]);
                int m = Integer.parseInt(inputs[1]);
                char inputArray[] = br.readLine().toCharArray(); //size n
                String indexArray[] = br.readLine().split(" "); //size m
                
                char utilString[] = br.readLine().toCharArray(); //size m
                Arrays.sort(utilString);
                char helperString[] = new char[m];

                int indexArr[]  = new int[m];

                for(int idx = 0; idx < m; idx++) {
                    indexArr[idx] = Integer.parseInt(indexArray[idx]);
                }

                Arrays.sort(indexArr);
                
                int idx = 0;
                int helperIdx = 0;
                
                while(idx < m-1) {
                    if(indexArr[idx] != indexArr[idx+1]) {
                        helperString[idx] = utilString[helperIdx];
                        helperIdx++;
                    }
                    idx++;
                }

                helperString[idx] = utilString[helperIdx];

                for(int i = 0; i < m; i++) {
                    if(helperString[i] == '\u0000') {
                        continue;
                    } else {
                        inputArray[indexArr[i]-1] = helperString[i];
                    }
                }

                System.out.println(String.valueOf(inputArray));
                

            }
        // }
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
