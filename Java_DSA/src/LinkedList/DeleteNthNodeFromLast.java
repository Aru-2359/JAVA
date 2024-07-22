import java.util.Scanner;

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteNthNodeFromLast {

    //**************************************************BRUTE FORCE APPROACH*********************************************************
    public static ListNode deletenthFromLast1(ListNode head, int n){

        int count = 0;
        ListNode temp = head;
        //Calculating the length of the linked list
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int p = count - n;
        temp = head;
        while(temp != null){
            p--;
            if(p == 0) break;
            temp = temp.next;
        }
        //temp points to the previous node of the node to be deleted
        ListNode nodeToDelete = temp.next;
        temp.next = nodeToDelete.next;
        nodeToDelete = null;

        return head;
    }

    //**************************************************OPTIMIZED APPROACH*********************************************************
    public static ListNode deletenthFromLast2(ListNode head, int n){

        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode nodeToDelete = slow.next;
        slow.next = nodeToDelete.next;
        nodeToDelete = null;

        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the linked list: ");
        int l = scanner.nextInt();

        System.out.print("Enter the elements of the linked list: ");
        ListNode head = new ListNode(scanner.nextInt());
        ListNode current = head;
        for (int i = 1; i < l; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        // Print the original linked list
        System.out.print("Original list: ");
        printList(head);

        // Separate even and odd nodes
        //ListNode newHead = deletenthFromLast1(head, n);
        ListNode newHead = deletenthFromLast2(head, n);

        // Print the modified linked list
        System.out.print("Modified list: ");
        printList(newHead);

        scanner.close();
    }
}
