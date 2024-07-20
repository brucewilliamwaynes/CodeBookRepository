// package src.USACO.Simulation;

import java.io.IOException;
// import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class BucketList {

    public static void main(String args[]) throws IOException {
        BucketList bucketList = new BucketList();
        bucketList.maxTotalBuckets();
    }

    public void maxTotalBuckets() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("blist.in"));
        PrintWriter pw = new PrintWriter("blist.out");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter pw = new PrintWriter(System.out);
        if(br.ready()){
            int N = Integer.parseInt(br.readLine());
            
            Map<Integer, Integer> startBucketMap = new TreeMap<Integer, Integer>();
            Map<Integer, Integer> endBucketMap = new TreeMap<Integer, Integer>();

            int maxTime = Integer.MIN_VALUE;

            for(int cow = 0; cow < N; cow++) {
                String input[] = br.readLine().split(" ");
                startBucketMap.put(Integer.parseInt(input[0]),Integer.parseInt(input[2]));
                endBucketMap.put(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                maxTime = Math.max(maxTime, Integer.parseInt(input[1]));
            }

            int totalBuckets = Integer.MIN_VALUE;
            int freeBuckets = 0;
            int usingBuckets = 0;

            for(int time = 1; time <= maxTime; time++) {

                if(startBucketMap.containsKey(time)) {
                    int requiredBuckets = startBucketMap.get(time);
                    if(freeBuckets > 0) {
                        usingBuckets += (requiredBuckets - Math.min(requiredBuckets,freeBuckets)) + Math.min(requiredBuckets, freeBuckets);
                        freeBuckets -= Math.min(requiredBuckets, freeBuckets);
                    } else {
                        usingBuckets += requiredBuckets;
                    }
                    totalBuckets = Math.max(totalBuckets, usingBuckets);
                }

                if(endBucketMap.containsKey(time)) {
                    usingBuckets = Math.max(0, usingBuckets - endBucketMap.get(time));
                    freeBuckets += endBucketMap.get(time);
                }

                // System.out.println("time : " + time + " free : " + freeBuckets + " using : " + usingBuckets);

            }

            pw.println(totalBuckets);
        
        }
        br.close();
        pw.close();
    }
    
}
