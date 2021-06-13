package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// One of the finest intituive mathematical questions.
// Need to read and visit basic algebra and relations and functions from Khan Academy.
public class A1485 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.ready()){
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T ; t++) {
                String inputs[] = br.readLine().split(" ");
                long A = Long.parseLong(inputs[0]);
                long B = Long.parseLong(inputs[1]);
                long count = 0;
                if(A == 0){
                    count = 0;
                } else {
                    count = A + 3;
                    int initialValue = (int)(B < 2 ? 2-B : 0);
                    long copyA = A;
                    long copyB = B;
                    long countMax = 0;
                    for(int iter = initialValue ; iter < count; iter++){
                        copyB = B + iter;
                        copyA = A;
                        countMax = iter;
                        while(copyA > 0){
                            copyA = copyA/copyB;
                            countMax++;
                        }
                        count = countMax < count ? countMax : count;
                    }
                    
                }
                System.out.println(count);
            }
        }
    }
}
