/* package codechef; // don't place package name! */

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeForces
{
    public class Person {
        public int cost;
        public int reach;
        Person(int cost, int reach) {
            this.cost = cost;
            this.reach = reach;
        }
    } 

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // if(br.ready()){
            int T = Integer.parseInt(br.readLine());
            for(int t = 1; t <= T ; t++) {
                String inputs[] = br.readLine().split(" ");
                int n = Integer.parseInt(inputs[0]);
                int p = Integer.parseInt(inputs[1]);
                String reach[] = br.readLine().split(" ");
                String cost[] = br.readLine().split(" ");
                List<Person> list = new ArrayList<Person>((Collection<? extends CodeForces.Person>) new Comparator<Person>() {
                    @Override
                    public int compare(Person a, Person b) {
                        return Integer.compare(a.cost, b.cost);
                    }
                });
                
                for(int idx = 0; idx < n; idx++) {
                    Person p = new Person(Integer.parseInt(reach[idx]), Integer.parseInt(cost[idx]));
                    list.add(p);
                }                
            }
        // } br.close();
    }

    // private static int findGCD(int i, int j, Map<Integer, Integer> myMap) {
    //     int gcd = findGCDUtil(i,j);
    //     if(gcd > 1){
    //         return 1;
    //     }
    //     return 0;
    // }

    // private static int findGCDUtil(int i, int j) {
    //     if(j == 0){
    //         return i;
    //     }
    //     return findGCDUtil(j, i%j);
    // }
}
