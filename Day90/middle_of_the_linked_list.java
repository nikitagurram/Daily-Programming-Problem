package Day90;

public class middle_of_the_linked_list {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode head = new ListNode(2, root);
        ListNode head1 = new ListNode(3, head);
        System.out.println(middleNode(head1));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
