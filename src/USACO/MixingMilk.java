import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class MixingMilk{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter pw = new PrintWriter("mixmilk.out");
        if(br.ready()){
            String inA[] = br.readLine().split(" ");
            String inB[] = br.readLine().split(" ");
            String inC[] = br.readLine().split(" ");
            int ac = Integer.parseInt(inA[0]);
            int a = Integer.parseInt(inA[1]);
            int bc = Integer.parseInt(inB[0]);
            int b = Integer.parseInt(inB[1]);
            int cc = Integer.parseInt(inC[0]);
            int c = Integer.parseInt(inC[1]);
            for(int i = 1; i <=100; ) {
                int pourableA = Math.min(bc-b,a);
                a = a - pourableA;
                b = b + pourableA;
                i++;
                if(i>100) {
                    break;
                }
                int pourableB = Math.min(cc-c,b);
                b = b - pourableB;
                c = c + pourableB;
                i++;
                int pourableC = Math.min(ac-a,c);
                c = c - pourableC;
                a = a + pourableC;
                i++;
            }
            pw.println(a);
            pw.println(b);
            pw.println(c);
        }
        br.close();
        pw.close();
    }
}