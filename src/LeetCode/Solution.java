/* package codechef; // don't place package name! */

import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// if(br.ready()){
		    int T = Integer.parseInt(br.readLine());
            Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		    for(int t = 0; t < T; t++){
		        int N = Integer.parseInt(br.readLine());
                String coordinates[] = br.readLine().split(" ");
                Integer arr [] = new Integer[N];
                List<Integer> evenArray = new ArrayList<Integer>();
                List<Integer> oddArray = new ArrayList<Integer>();
                for(int index = 0; index < N; index++) {
                    arr[index] = Integer.parseInt(coordinates[index]);
                }
                // Arrays.sort(arr, Collections.reverseOrder());

                for(int index = 0; index < N; index++) {
                    if(arr[index] % 2 == 0){
                        evenArray.add(arr[index]);
                    } else {
                        oddArray.add(arr[index]);
                    }
                }

                int newArr[] = new int[N];

                // int minLength = evenArray.size() > oddArray.size() ? oddArray.size() : evenArray.size();
                int index = 0;
                // int idn = 0;
                // for(idn = 0; idn < minLength; idn++){
                //     newArr[index] = evenArray.get(idn);
                //     newArr[index + 1] = oddArray.get(idn);
                //     index = index + 2;
                // }

                for(int i = 0; i < evenArray.size(); i++) {
                    newArr[index] = evenArray.get(i);
                    index++;
                }

                for(int i = 0; i < oddArray.size(); i++) {
                    newArr[index] = oddArray.get(i);
                    index++;
                }

                int count = 0;
                for(int i = 0; i < N-1; i++) {
                    for(int ind = i+1 ; ind < N; ind++){
                        count += findGCD(newArr[i], 2*newArr[ind], myMap);
                    }
                }
                System.out.println(count);
		    }
		// }
	}

    private static int findGCD(int i, int j, Map<Integer, Integer> myMap) {
        int gcd = findGCDUtil(i,j);
        if(gcd > 1){
            return 1;
        }
        return 0;
    }

    private static int findGCDUtil(int i, int j) {
        if(j == 0){
            return i;
        }
        return findGCDUtil(j, i%j);
    }
}
