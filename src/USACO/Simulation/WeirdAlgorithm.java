package src.USACO.Simulation;
import java.io.*;

public class WeirdAlgorithm {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        if(br.ready()) {
            long n = Long.parseLong(br.readLine());

            while(n != 1) {
                pw.print(n + " ");
                if(n%2 ==0) {
                    n /= 2;
                } else {
                    n = 3*n + 1;
                }
            }

            pw.print(n);
            pw.println();
        }
        pw.close();
        br.close();
    }
}
