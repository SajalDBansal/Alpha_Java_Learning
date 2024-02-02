// import java.util.LinkedList;

public class Linked_L {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        };
    };

    public static Node head;
    public static Node tail;
    public int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public void print() {
        Node temp = head;
        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null ]");
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void replace(int index, int data) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data = data;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("[ null ]");
            return Integer.MIN_VALUE;
        }
        size--;
        int val = head.data;
        if (head.next == null) {
            head = tail = null;
            return val;
        }
        head = head.next;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("[ null ]");
            return Integer.MIN_VALUE;
        }

        size--;
        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public int recSearch(int key) {
        Node temp = head;
        // return helper_1(temp, key, 0);
        return helper_2(temp, key);
    }

    public int helper_1(Node temp, int key, int index) {
        if (temp == null) {
            return -1;
        }

        if (temp.data == key) {
            return index;
        }

        return helper_1(temp.next, key, index + 1);
    }

    public int helper_2(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int index = helper_2(head.next, key);
        if (index == -1) {
            return -1;
        }

        return index + 1;
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNthfromEnd(int index) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (index == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int iTofind = sz - index;
        Node prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Find mid
        Node head2 = findMid(head);

        // Reverse second half
        Node prev = null;
        Node curr = head2;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head2 = prev;
        Node head1 = head;

        // check if both ll equal
        while (head2 != null) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }

    public boolean isLooping() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeLoop() {
        // Base case
        if (head == null || head.next == null) {
            return;
        }

        // Slow fast approach / detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // Get the cycling element
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // Mid node
        Node mid = getMid(head);
        // right ll
        Node rightHead = mid.next;
        mid.next = null;
        // two sorted ll
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge two sorted ll
        return merge(newLeft, newRight);

    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node zigzagLL(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // get mid
        Node mid = slow;
        Node righthead = mid.next;
        mid.next = null;

        // reverse second ll
        Node prev = null;
        Node curr = righthead;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node reversedLL = prev;

        Node zigzag = new Node(-1);
        Node temp = zigzag;
        Node head1 = head;
        Node head2 = reversedLL;
        while (head1 != null || head2 != null) {
            if (head1 != null && head2 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            } else {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
        }

        return zigzag.next;
    }

    public static void main(String[] args) {
        // // Introduction
        // Linked_L ll = new Linked_L();

        // // Head and Tail of ll
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // ll.head.next.next = new Node(3);

        // // add first element - time - O(1)
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);

        // // add last element - time - O(1)
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.print();

        // // print a ll - time - O(n)
        // ll.print();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.print();

        // // add at the middle - time - O(n)
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.print();
        // ll.add(2, 9);
        // ll.print();

        // // replace at index - time - O(n)
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.print();
        // ll.replace(3, 7);
        // ll.print();

        // // size of ll
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // System.out.println(ll.size);

        // // remove first element - time - O(n)
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);

        // // remove last element
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // // System.out.println(ll.removeLast());
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // // Iterative search
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // int key = 40;
        // System.out.println(ll.itrSearch(key));

        // // Recursive search - time - O(n)
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // int key = 3;
        // System.out.println(ll.recSearch(key));
        // key = 30;
        // System.out.println(ll.recSearch(key));

        // // reverse ll
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // ll.reverse();
        // ll.print();

        // // find and remove nth node from end
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // ll.removeNthfromEnd(3);
        // ll.print();

        // // Check if palindrome
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // // ll.addLast(5);
        // ll.addLast(3);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.isPalindrome());

        // Detect a loop / cyclein a ll - Flyd's cycle finding algo
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // ll.head.next.next = new Node(3);
        // ll.head.next.next.next = new Node(4);
        // ll.head.next.next.next.next = new Node(5);
        // ll.head.next.next.next.next.next = new Node(6);
        // ll.head.next.next.next.next.next.next = new Node(7);
        // ll.head.next.next.next.next.next.next.next = ll.head.next.next;
        // System.out.println(ll.isLooping());

        // // remove loop in ll
        // ll.removeLoop();
        // ll.print();

        // // In build LinkedList
        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addFirst(0);
        // System.out.println(ll);
        // ll.removeLast();
        // System.out.println(ll);
        // ll.removeFirst();
        // System.out.println(ll);

        // // Merge sort in ll
        // // LinkedList<Integer> ll = new LinkedList<>();
        // Linked_L ll = new Linked_L();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        // Zig-Zag Linked List
        Linked_L ll = new Linked_L();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        Node temp = ll.zigzagLL(head);
        ll.print();
    }

}