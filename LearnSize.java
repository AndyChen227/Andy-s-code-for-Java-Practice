public class LearnSize {
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(learnSize(list));
    }

    public static int learnSize (ListNode list) {
        ListNode current = list;
        int size = 0;
        if (current == null) {
            return 0;
        }
        while (current != null) {
            size += 1;
            current = current.next;
        }
        return size;
    }
}
