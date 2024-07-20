package src.USACO.Simulation;
// package USACO;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class NumberSpiral {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        // if(br.ready()){
            int T =Integer.parseInt(br.readLine());
            for(int t = 1; t <= T; t++) {
                String input[] = br.readLine().split(" ");
                long y = Long.parseLong(input[0]);
                long x = Long.parseLong(input[1]);
                if(y%2 == 0) {
                    
                } else {

                }
                
            }
        // }
        pw.close();
        br.close();
    }
}
