package B;

import java.io.*;

public class B1515 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.ready()){
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T ; t++) {
                long num = Long.parseLong(br.readLine());
                if(num%2 == 0 && isSquare(num/2)){
                    System.out.println("YES");
                } else if(num%4 == 0 && isSquare(num/4)){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static boolean isSquare(long l) {
        double d = l;
        int num = (int)Math.sqrt(d);
        return num * num == l;
    }
}
