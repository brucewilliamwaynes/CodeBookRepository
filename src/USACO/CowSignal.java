// package USACO;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class CowSignal {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("cowsignal.in"));
        PrintWriter pw = new PrintWriter("cowsignal.out");
        // if(br.ready()) {
            String input[] = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);
            StringBuffer ans = new StringBuffer();
            for(int row = 0; row < M; row++) {
                String line = br.readLine();
                StringBuffer sb = new StringBuffer();
                for(int col = 0; col < N; col++) {
                    for(int rep = 0; rep < K; rep++) {
                        sb.append(line.charAt(col));
                    }
                }
                // ans.append(sb);
                for(int rep = 0; rep < K; rep++) {
                    pw.println(sb);
                }
            }
            
        // }
        pw.close();
        br.close();
    }
    
}
