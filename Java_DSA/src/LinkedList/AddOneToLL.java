import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class AddOneToLL{

    //**************************************************BRUTE FORCE APPROACH*********************************************************
    public static ListNode addOneToList1(ListNode head){

        head = reverseList(head);
        ListNode temp = head;
        int carry = 1;
        while(temp != null){
            temp.val = temp.val + carry;
            if(temp.val < 10){
                carry = 0;
                break;
            }else{
                temp.val = 0;
                carry = 1;
            }
            temp = temp.next;
        }
        head = reverseList(head);
        if(carry == 1){
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
        return head;
    }

    public static ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    //**************************************************OPTIMIZED APPROACH*********************************************************

    public static ListNode addOneToList2(ListNode head){

        int carry = helper(head);
        if(carry == 1){
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
        return head;
    }

    public static int helper(ListNode temp){
        if(temp == null) return 1; //Base Case
        int carry = helper(temp.next); //Recursive Call
        temp.val = temp.val + carry;
        if(temp.val < 10){
            return 0;
        }
        temp.val = 0;
        return 1;
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
        // Print the original linked list
        System.out.print("Original list: ");
        printList(head);

        //ListNode newHead = addOneToList1(head);
        ListNode newHead = addOneToList2(head);

        // Print the modified linked list
        System.out.print("Modified list: ");
        printList(newHead);

        scanner.close();
    }
}