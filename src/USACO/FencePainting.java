package USACO;

import java.io.*;

public class FencePainting {
    public static void main(String agrs[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter("paint.out");
        if(br.ready()) {
            String inputLine[] = br.readLine().split(" "); 
            String inputLineSecond[] = br.readLine().split(" ");
            long a  = Integer.parseInt(inputLine[0]);
            long b = Integer.parseInt(inputLine[1]);
            long c = Integer.parseInt(inputLineSecond[0]);
            long d = Integer.parseInt(inputLineSecond[1]);
            if(c < b) {
                long startNu = a < c ? a : c;
                long endNu = b > d ? b : d;
                pw.println(endNu - startNu);
            } else {
                pw.println(d-c + b-a);
            }
            pw.close();
        }
        br.close();
    }
}
