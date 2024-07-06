import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;

public class ShellGame {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter("shell.out");
        if(br.ready()){
            int N = Integer.parseInt(br.readLine());
            int shellPos[] = new int[3];
            shellPos[0] = 0;
            shellPos[1] = 1;
            shellPos[2] = 2;
            int count[] = new int[3];
            for(int i = 1; i <= N; i++) {
                String input[] = br.readLine().split(" ");
                int pos1 = Integer.parseInt(input[0]) - 1;
                int pos2 = Integer.parseInt(input[1]) - 1;
                int guess = Integer.parseInt(input[2]) - 1;
                int temp = shellPos[pos1];
                shellPos[pos1] = shellPos[pos2];
                shellPos[pos2] = temp;
                count[shellPos[guess]]++;
            }
            pw.println(Math.max(count[0], Math.max(count[1], count[2])));
        }
        br.close();
        pw.close();
        
    }
}
