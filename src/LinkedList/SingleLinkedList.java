package LinkedList;

import java.util.logging.Logger;

public class SingleLinkedList {

    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    // This head is what points to the start of the linked list, and the single node.
    private Node head;

    public SingleLinkedList() {
        head = null; //Is not need because by default the references are pointing to null.
    }

    //Get the head of the linked list.
    public Node getHead() {
        //The only place where asking for a head is appropriate.
        return head;
    }

    //Append an element to the last of the linked list.
    public void appendToTail(int newData) {
        
        Node newNode = new Node(newData);
        Node current = this.head;
        if (current == null) {
            this.head = newNode;
        } else {
            //Iterating to the next node and finally to the last node of the linked list.
            while(current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    //Delete specific data from the linked list.
    //For now we assume every data in the linked list to be unique.
    //Need to implement when the data is a generic type and delete all the occurrences of the data value.
    public void deleteNode(int oldData) throws RuntimeException{
        Node current = this.head;
        if ( current == null ) {
            throw new RuntimeException("List is empty, cannot delete anything from empty list.");
        }
    
        if( current.getData() == oldData) {
            if(current.getNext() == null) {
                 logger.info("The current list is now empty.");
            }
            current = current.getNext();
            return;
        }
        
        Node prev = current;

        while( current.getNext() != null) {
            //Don't compare the references but the values of it.
            if (current.getData() == oldData) {
                prev.setNext(current.getNext());
                return;
            }
            prev = current;
            current = current.getNext();
        }

        //For the last element of the linked list.
        if(current.getData() == oldData) {
            prev.setNext(current.getNext());
            return;
        }

        logger.info("Couldn't find the element in this list.");
    }

}
