package src.USACO.Simulation;
// package src.USACO;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.io.IOException;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;
// import java.util.Collections;

public class BovineShuffle {

    // class PosId {
    //     int pos;
    //     int id;
    //     PosId(int _pos, int _id) {
    //         pos = _pos;
    //         id = _id;
    //     }
    // }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("shuffle.in"));
        PrintWriter pw = new PrintWriter("shuffle.out");
        if(br.ready()) {
            int N = Integer.parseInt(br.readLine());
            String input1[] = br.readLine().split(" ");
            String input2[] = br.readLine().split(" ");
            // List<PosId> posIdList = new ArrayList<PosId>();
            Map<Integer, Integer> posId = new TreeMap<Integer, Integer>();

            for(int i = 0; i < N; i++) {
                posId.put(Integer.parseInt(input1[i]), Integer.parseInt(input2[i]));
            }

            for(Integer Id : posId.values()) {
                pw.println(Id);
            }

        }
        br.close();
        pw.close();
    }    
}
