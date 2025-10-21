import java.util.*;
public class GetLast {
    public static void main(String[] args) {
        ListNode list = new ListNode(4, new ListNode(6, new ListNode(1, new ListNode(2))));
        System.out.println(getLast(list));
    }

    // Function: Return the last one in the ListNode
    public static int getLast(ListNode list) {
        if (list == null) {
            throw new NoSuchElementException("List in empty!");
        }
        ListNode current = list;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }
}
