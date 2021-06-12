package A;

import java.io.*;
import java.math.BigInteger;

public class A1521 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.ready()){
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T ; t++) {
                String inputs[] = br.readLine().split(" ");
                int A = Integer.parseInt(inputs[0]);
                int B = Integer.parseInt(inputs[1]);
                if(B == 1){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    BigInteger y = BigInteger.valueOf(A).multiply(BigInteger.valueOf(B));
                    BigInteger z = BigInteger.valueOf(A).multiply(BigInteger.valueOf(B+1));
                    StringBuffer ans = new StringBuffer();
                    ans.append(A);
                    ans.append(" ");
                    ans.append(y);
                    ans.append(" ");
                    ans.append(z);
                    System.out.println(ans.toString());
                }
            }
        }
    }
}
