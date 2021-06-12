package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1499 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.ready()){
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T; t++){
                String input = br.readLine();
                int firstIndex = input.indexOf("11");
                int lastIndex = input.lastIndexOf("00");
                if(firstIndex != -1 && lastIndex != -1 && firstIndex < lastIndex){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
