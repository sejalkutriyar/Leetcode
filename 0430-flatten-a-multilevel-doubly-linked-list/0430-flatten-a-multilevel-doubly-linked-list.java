/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node curr = head;
        while(curr != null) {
            if(curr.child != null) {
                Node next = curr.next;
                Node childHead = flatten(curr.child);
                curr.child = null;
                curr.next = childHead;
                childHead.prev = curr;

                Node tail = curr;
                
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = next;
                if(next != null) {
                    tail.next = next;
                    tail.next.prev = tail;
                }
            }
            curr = curr.next;
        }
        return head;
    }
}