// package src.USACO;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;

public class SpeedingTicket {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter("speeding.out");
        if(br.ready()) {
            String inputs[] = br.readLine().split(" ");
            int N = Integer.parseInt(inputs[0]);
            int M = Integer.parseInt(inputs[1]);
            // System.out.println(N + " : " + M);
            int speedLimitArray[] = new int[100];
            int speedArray[] = new int[100];
            int startKms = 0;
            
            for(int i = 0; i < N; i++) {
                String inputArr[]  = br.readLine().split(" ");
                int dist = Integer.parseInt(inputArr[0]);
                int speed = Integer.parseInt(inputArr[1]);
                // System.out.println(startKms + ": " + dist + " : " + speed);
                for(int j = startKms; j < startKms + dist; j++) {
                    speedLimitArray[j] = speed;
                }
                startKms += dist;
            }

            startKms = 0;
            for(int i = 0; i < M; i++) {
                String inputArr[]  = br.readLine().split(" ");
                int dist = Integer.parseInt(inputArr[0]);
                int speed = Integer.parseInt(inputArr[1]);
                // System.out.println(startKms + ": " + dist + " : " + speed);
                for(int j = startKms; j < startKms + dist; j++) {
                    speedArray[j] = speed;
                }
                startKms += dist;
            }

            int maxSpeedOver = 0;
            for(int i = 0; i < 100; i++) {
                maxSpeedOver = Math.max(maxSpeedOver, speedArray[i] - speedLimitArray[i] );
            }
            // System.out.println(maxSpeedOver);
            pw.println(maxSpeedOver);

        }
        br.close();
        pw.close();
    }
}
