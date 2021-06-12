package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1485 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // if(br.ready()){
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T ; t++) {
                String inputs[] = br.readLine().split(" ");
                long A = Long.parseLong(inputs[0]);
                long B = Long.parseLong(inputs[1]);
                int count = 0;
                if(B == 1){
                    count++;
                    B = B+1;
                }
                while(A > 0){
                    A = A/B;
                    count++;
                }
                System.out.println(count);
            }
        // }
    }
}
