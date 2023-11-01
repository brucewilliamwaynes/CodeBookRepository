// package USACO;
import java.io.*;

public class IncreasingArray {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        // if(br.ready()) {
            int length = Integer.parseInt(br.readLine());
            String input[] = br.readLine().split(" ");
            int currentMax = 0;
            int arr[] = new int[length];
            for(int index = 0; index < length; index++) {
                arr[index] = Integer.parseInt(input[index]);
            }

            long minMoves = 0;
            currentMax = arr[0];

            for(int index = 1; index < length;index++) {
                int curr = arr[index];
                if(curr < currentMax) {
                    minMoves += (currentMax - curr);
                    arr[index ] = currentMax;
                } else if( curr == currentMax) {
                    continue;
                } else {
                    currentMax = curr;
                }
            }

            pw.println(minMoves);
        // }
        pw.close();
        br.close();
    }
}
