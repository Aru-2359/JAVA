import java.util.Scanner;

public class BasicLinkedListUsingOOP {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class linkedList{
        Node head = null;
        int size(){
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        void insertAtFirst(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }
        void insertAtLast(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
            }else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = null;
            }
        }
        void insertBefore(int target, int data){
            Node newNode = new Node(data);
            if (head == null) {
                System.out.println("List is empty. Cannot insert before " + target);
                return;
            }
            if (head.data == target) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            while(temp.next!= null){
                if(temp.next.data == target){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
            }
            System.out.println(target + " is not present in the linked list!");
        }
        void insertAfter(int target, int data){
            Node newNode = new Node(data);
            if (head == null) {
                System.out.println("List is empty. Cannot insert before " + target);
                return;
            }
            Node temp = head;
            while(temp.next!= null){
                if(temp.data == target){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
            }
            System.out.println(target + " is not present in the linked list!");
        }
        void insertAtPos(int pos, int data){
            Node newNode = new Node(data);
            if (head == null) {
                System.out.println("The list is empty!");
                return;
            }
            if(pos < 1){
                System.out.println("Invalid position! The position should be greater than 0!");
            }
            if (pos == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            for(int i = 1; i < pos - 1 && temp != null; i++){
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("The position exceeds the size of the linked list!");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        void deleteFirst(){
            if(head == null){ 
                System.out.println("The list is empty!");
                return;
            }else{
                head = head.next;
            }
        }
        void deleteLast(){
            if(head == null){ 
                System.out.println("The list is empty!");
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        void deleteElement(int target){
            if(head == null){ 
                System.out.println("The list is empty!");
                return;
            }
            if (head.data == target) {
                head = head.next;
                return;
            }
            Node temp = head;
            while(temp.next != null){
                if(temp.next.data == target){
                    Node curr = temp.next;
                    temp.next = curr.next;
                    curr.next = null;
                    return;
                }
                temp = temp.next;
            }
            System.out.println(target + " is not present in the linked list!");
        }
        void deleteAtIdx(int idx) {
            if (head == null) {
                System.out.println("The list is empty!");
                return;
            }
            if (idx < 1) {
                System.out.println("Invalid index. Index should be 1 or greater.");
                return;
            }
            if (idx == 1) {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx - 1; i++) {
                if (temp.next == null) {
                    System.out.println("The position exceeds the size of the linked list!");
                    return;
                }
                temp = temp.next;
            }
            if (temp.next == null) {
                System.out.println("The position exceeds the size of the linked list!");
                return;
            }
            Node curr = temp.next;
            temp.next = curr.next;
            curr.next = null;
        }
        Node reverse(Node head) {
            if (head == null || head.next == null)
                return head;

            Node rest = reverse(head.next);
            head.next.next = head;
            head.next = null;

            return rest;
        }

        void reverse() {
            head = reverse(head);
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, value, target, position;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.println("3. Insert before a value");
            System.out.println("4. Insert after a value");
            System.out.println("5. Insert at a specific position");
            System.out.println("6. Delete First");
            System.out.println("7. Delete Last");
            System.out.println("8. Delete a specific value");
            System.out.println("9. Delete at a specific index");
            System.out.println("10. Display");
            System.out.println("11. Get Size");
            System.out.println("12. Reverse List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at first: ");
                    value = scanner.nextInt();
                    ll.insertAtFirst(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at last: ");
                    value = scanner.nextInt();
                    ll.insertAtLast(value);
                    break;
                case 3:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    System.out.print("Enter value before which to insert: ");
                    target = scanner.nextInt();
                    ll.insertBefore(target, value);
                    break;
                case 4:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    System.out.print("Enter value after which to insert: ");
                    target = scanner.nextInt();
                    ll.insertAfter(target, value);
                    break;
                case 5:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    System.out.print("Enter position to insert: ");
                    position = scanner.nextInt();
                    ll.insertAtPos(position, value);
                    break;
                case 6:
                    ll.deleteFirst();
                    break;
                case 7:
                    ll.deleteLast();
                    break;
                case 8:
                    System.out.print("Enter value to delete: ");
                    target = scanner.nextInt();
                    ll.deleteElement(target);
                    break;
                case 9:
                    System.out.print("Enter index to delete: ");
                    position = scanner.nextInt();
                    ll.deleteAtIdx(position);
                    break;
                case 10:
                    System.out.println("Linked List:");
                    ll.display();
                    break;
                case 11:
                    System.out.println("Size of the Linked List: " + ll.size());
                    break;
                case 12:
                    ll.reverse();
                    System.out.println("Linked List reversed.");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter again.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
