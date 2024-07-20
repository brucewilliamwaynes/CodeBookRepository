package src.USACO.Simulation;
// package src.USACO;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;

public class LostCow {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lostcow.in"));
        PrintWriter pw = new PrintWriter("lostcow.out");
        if(br.ready()) {
            String input[] = br.readLine().split(" ");
            long x = Long.parseLong(input[0]);
            long y = Long.parseLong(input[1]);
            long xf = x;
            long totalDistance = 0;
            long count = 0;

            do {
                if(count%2==0) {
                    xf = xf + (2^count);
                } else {
                    xf = xf - (2^count);
                }
                count = count + 1;
                totalDistance = Math.abs(xf - x);
                if(xf == y) {
                    break;
                }
            } while(xf < y);
            
            if(xf == y) {
                pw.println(totalDistance);
            } else {
                if(count%2==0) {
                    xf = xf 
                }
            }

        }
        br.close();
        pw.close();
    }
}
