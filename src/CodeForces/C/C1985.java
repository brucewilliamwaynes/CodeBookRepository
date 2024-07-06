package C;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C1985 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.ready()) {
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T; t++) {
                int n = Integer.parseInt(br.readLine());
                String inputs[] = br.readLine().split(" ");
                int currSum = Integer.parseInt(inputs[0]);
                int count = 1;
                for(int i = 1; i < inputs.length; i++) {
                    int number = Integer.parseInt(inputs[i]);
                    if(number == currSum) {
                        
                    }
                }
            }
        }
        br.close();
    }
}
