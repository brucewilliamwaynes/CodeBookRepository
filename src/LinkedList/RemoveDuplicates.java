package LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * Removing duplicates from a singly linked list.
 */
public class RemoveDuplicates {
    /**
     * Using an extra space for removing.
     * @param head
     */
    public static void removeDups(Node head) {
        Map<Integer, Integer> lookupMap = new HashMap<Integer, Integer>();
        Node current = head;
        Node prev = null;
        while(current != null) {
            if(lookupMap.isEmpty()){
                lookupMap.put(current.getData(), 1);
                prev = current;
            } else {
                Integer value = lookupMap.get(current.getData());
                if(value == null) {
                    lookupMap.put(current.getData(), 1);
                    prev = current;
                } else {
                    deleteNode(prev, current, head);
                }
            }
            current = current.getNext();
        }
    }

    /**
     * O(n2) time complexity accepted and two pointers.
     * @param head
     */
    private static void removeDupsWithoutExtraSpace(Node head) {
  
    }

    private static void deleteNode(Node prev, Node current, Node head) {
        if(prev == null) {
            head = head.getNext();
        } else {
            prev.setNext(current.getNext());
        }
    }
}
