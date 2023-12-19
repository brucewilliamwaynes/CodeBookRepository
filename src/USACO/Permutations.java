// package USACO;

import java.io.*;

public class Permutations {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        // if(br.ready()) {
            long n = Long.parseLong(br.readLine());
            if(n == 1) {
                pw.write("1");
            } else if(n <= 3){
                pw.write("NO SOLUTION");
            } else {
                StringBuffer result = new StringBuffer();
                long oddCount = 1;
                long evenCount = n/2 + 1;
                for(int index = 0; index < n; index++) {
                    if(index%2 != 0) {
                        result.append(oddCount+ " ");
                        oddCount++;
                    } else {
                        result.append(evenCount + " ");
                        evenCount++;
                    }
                }
                pw.write(result.toString().trim());
            }
        // }
        pw.close();
        br.close();
    }
}
