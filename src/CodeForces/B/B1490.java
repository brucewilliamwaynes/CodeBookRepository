package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1490 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.ready()){
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T; t++){
                int N = Integer.parseInt(br.readLine());
                String inputs[] = br.readLine().split(" ");
                int arr[] = new int[N];
                int remArr[] = new int[3];
                for(int index = 0; index < N; index++){
                    arr[index] = Integer.parseInt(inputs[index]);
                    int rem = arr[index]%3;
                    if(rem == 0){
                        remArr[0]++;
                    } else if(rem == 1){
                        remArr[1]++;
                    } else {
                        remArr[2]++;
                    }
                }
                int idealNum = N/3;
                int moves = 0;
                int minValue = Math.min(remArr[0],Math.min(remArr[1],remArr[2]));
                while(minValue != idealNum){
                    for(int rem = 0; rem < 3; rem++){
                        if(remArr[rem] > idealNum){
                            remArr[rem]--;
                            moves++;
                            remArr[(rem+1)%3]++;
                        }
                    }
                    minValue = Math.min(remArr[0],Math.min(remArr[1],remArr[2]));
                }
                System.out.println(moves);
            }
        }
    }
}
