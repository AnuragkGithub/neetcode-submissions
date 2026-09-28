class LinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public int get(int i) {
        if (i < 0) {
            return -1;
        }

        Node current = head;
        int index = 0;

        while (current != null) {
            if (index == i) {
                return current.val;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public boolean remove(int i) {
        if (i < 0 || head == null) {
            return false;
        }

        if (i == 0) {
            head = head.next;
            return true;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < i - 1) {
            current = current.next;
            index++;
        }

        if (current == null || current.next == null) {
            return false;
        }

        current.next = current.next.next;

        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node current = head;

        while (current != null) {
            result.add(current.val);
            current = current.next;
        }

        return result;
    }
}