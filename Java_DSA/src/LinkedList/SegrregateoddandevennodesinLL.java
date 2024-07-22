import java.util.ArrayList;
import java.util.Scanner;

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SegrregateoddandevennodesinLL {

    //**************************************************BRUTE FORCE APPROACH*********************************************************
    public static ListNode seperateEvenOdd1(ListNode head){

        if(head == null || head.next == null) return head;

        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        //for odd
        while(temp != null && temp.next != null){
            arr.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null) arr.add(temp.val); //in case of a linked list with odd length, last element will not be added in the array list if not added explicitly
        //for even
        temp = head.next;
        while(temp != null && temp.next != null){
            arr.add(temp.val);
            temp = temp.next.next;
        }
        //replace all the elements in the linked list with the elements in the array
        temp = head;
        int i = 0;
        while(temp != null){
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }

    //**************************************************OPTIMIZED APPROACH*********************************************************
    public static ListNode seperateEvenOdd2(ListNode head){

        if(head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

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
        int n = scanner.nextInt();

        System.out.print("Enter the elements of the linked list: ");
        ListNode head = new ListNode(scanner.nextInt());
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        // Print the original linked list
        System.out.print("Original list: ");
        printList(head);

        // Separate even and odd nodes
        //ListNode newHead = seperateEvenOdd1(head);
        ListNode newHead = seperateEvenOdd2(head);

        // Print the modified linked list
        System.out.print("Modified list: ");
        printList(newHead);

        scanner.close();
    }
}
