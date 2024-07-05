class BasicLinkedListWithoutUsingOOP{

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Display linked list
    public static void display(Node head){
        if(head == null) System.out.println("The list is empty!");
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Display the linked list using recursion
    public static void displayRecur(Node node){
        if(node == null) return;
        System.out.print(node.data + " ");
        displayRecur(node.next);
    }

    // Display the reversed linked list using recursion
    public static void displayReverseRecur(Node node){
        if(node == null) return;
        displayReverseRecur(node.next);
        System.out.print(node.data + " ");
    }

    public static int length(Node node){
        int count = 0;
        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(14);
        Node d = new Node(19);
        Node e = new Node(2);

        // a -> b -> c -> d -> e
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);

        System.out.print("The original linked list is: ");
        display(a);
        System.out.print("\nThe reversed linked list is: ");
        displayReverseRecur(a);
        int len =length(a);
        System.out.println("\nThe length of the linked list is: " + len);
    }
}