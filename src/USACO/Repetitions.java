// package USACO;
import java.io.*;

public class Repetitions {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        // if(br.ready()) {
            String input = br.readLine();
            int longestRepetition = 1;
            char ch = input.charAt(0);
            int currentLongest = 1;
            for(int index = 1; index < input.length(); index++) {
                char candCh = input.charAt(index);
                if(candCh == ch) {
                    currentLongest++;
                } else {
                    longestRepetition = Math.max(longestRepetition, currentLongest);
                    currentLongest = 1;
                    ch = candCh;
                }
            }
            longestRepetition = Math.max(longestRepetition, currentLongest);
            pw.println(longestRepetition);
        // }
        pw.close();
        br.close();
    }
}