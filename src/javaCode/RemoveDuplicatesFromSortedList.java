package javaCode;

//Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
// Return the linked list sorted as well.

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

    }

//    public RemoveDuplicatesListNode deleteDuplicates(RemoveDuplicatesListNode head) {}

}

class RemoveDuplicatesListNode {
    int val;
    RemoveDuplicatesListNode next;
    RemoveDuplicatesListNode prev;

    RemoveDuplicatesListNode() {
    }

    RemoveDuplicatesListNode(int val) {
        this.val = val;
    }

    RemoveDuplicatesListNode(int val, RemoveDuplicatesListNode next) {
        this.val = val;
        this.next = next;
    }
}

