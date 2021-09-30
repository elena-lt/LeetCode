package javaCode;

//Merge two sorted linked lists and return it as a sorted list.
//The list should be made by splicing together the nodes of the first two lists.

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode mergedList = new ListNode();
        ListNode tail = mergedList;

        while (l1 != null && l2 !=null){
            if (l1.val >= l2.val){
                tail.next = l2;
                l2 = l2.next;
            }else {
                tail.next = l1;
                l1 = l1.next;
            }
            tail = tail.next;
        }

        if (l1==null) tail.next = l2;
        if (l2 ==null) tail.next = l1;

        return mergedList.next;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(){}
    ListNode (int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
