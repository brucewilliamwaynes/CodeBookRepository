import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DPDriver {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int answer = LongestCommonSubstring.LCSUtil(a,b);
        System.out.println(answer);
    }
}
