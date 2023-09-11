package USACO;
import java.io.*;

public class MissingNumber {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        // if(br.ready()) {
            int n = Integer.parseInt(br.readLine());
            long answer = 1;
            String input[] = br.readLine().split(" ");
            for(int idx = 2; idx < n+1 ; idx++) {
                answer += idx;
                answer -= Integer.parseInt(input[idx-2] );
            }
            pw.println(answer);
        // }
        pw.close();
        br.close();
    }
}