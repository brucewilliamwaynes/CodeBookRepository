package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;

public class DriverClass {
    public static void main(String args[]) throws IOException{
        SingleLinkedList sll = new SingleLinkedList();
        
        createInput(sll);

        doSomething(sll);

        printSomething(sll);

    }

    private static void printSomething(SingleLinkedList sll) {
        Node current = sll.getHead();
        StringBuffer sb = new StringBuffer();
        while(current != null) {
            sb.append(current.getData());
            sb.append("\n");
            current = current.getNext();
        }
        System.out.println(sb.toString());
    }

    private static void doSomething(SingleLinkedList sll) {
        RemoveDuplicates.removeDups(sll.getHead());
    }

    private static void createInput(SingleLinkedList sll) throws IOException{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        // if(br.ready()) {
        // int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        for (String in : input) {
            sll.appendToTail(Integer.parseInt(in));
        }
        // }
    }

}
