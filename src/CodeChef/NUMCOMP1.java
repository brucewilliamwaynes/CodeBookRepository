/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NUMCOMP1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(br.ready()){
		    int T = Integer.parseInt(br.readLine());
		    for(int t = 0; t < T; t++){
		        String input[] = br.readLine().split(" ");
		        int N = Integer.parseInt(input[0]);
		        int K = Integer.parseInt(input[1]);
		        String inputs = br.readLine();
				String queries[] = br.readLine().split(" ");
				int arr[] = new int[N];
				int originalDistance  = 0;
				for(int index = 0; index < N; index++) {
					arr[index] = Integer.parseInt(inputs.charAt(index)+"");
				}

				if(N == 1) {
					for(int i  = 0; i < K; i++){
						System.out.println(0);
					}
				} else {
					for(int index = 1; index < N && N > 2; index++){
						if(arr[index] == arr[index-1]){
							originalDistance += 2;
						} else {
							originalDistance += 1;
						}
					}
					// if(arr[0] == arr[1]){
					// 	originalDistance += 2;
					// } else {
					// 	originalDistance += 1;
					// }
	
					for(int index = 0; index < K; index++) {
						int pos = Integer.parseInt(queries[index]) - 1;
						arr[pos] = arr[pos] == 0 ? 1 : 0;
						if(pos == 0) {
							if(arr[pos] == arr[pos+1]) {
								originalDistance += 1;
							} else {
								originalDistance -= 1;
							}
						} else if (pos == N-1) {
							if(arr[pos] == arr[pos-1]){
								originalDistance += 1;
							} else {
								originalDistance -= 1;
							}
						} else {
							if(arr[pos] == arr[pos-1]){
								originalDistance += 1;
							} else {
								originalDistance -= 1;
							}
							if(arr[pos] == arr[pos+1]) {
								originalDistance += 1;
							} else {
								originalDistance -= 1;
							}
						}
						System.out.println(originalDistance);
					 }
				}
		    }
		}
	}
}
