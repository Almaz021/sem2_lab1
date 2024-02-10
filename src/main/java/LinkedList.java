public class LinkedList implements List301 {
    Node head;
    int size = 0;

    public void add(Integer e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        if (head == null) {
            head = new Node();
            head.value = e;
        } else {
            Node current = head;
            Node n = new Node();
            n.value = e;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
        size++;
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        if (size > index) {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            size--;
        } else {
            throw new IndexOutOfBoundsException("del err");
        }
    }

    public Integer pop() throws IndexOutOfBoundsException {
        Node curr = head;
        if (head != null) {
            if (head.next == null) {
                int el = head.value;
                head = null;
                size--;
                return el;
            }
            while (true) {
                if (curr.next.next == null) {
                    int el = curr.next.value;
                    curr.next = null;
                    size--;
                    return el;
                }
                curr = curr.next;
            }
        }
        throw new IndexOutOfBoundsException("pop err");
    }

    public Integer get(int index) {
        Node curr = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                curr = curr.next;
                if (curr == null) {
                    return null;
                }
            }
            return curr.value;
        }
        return null;
    }

    public int size() {
        return size;
    }


    public String toString() {
        Node curr = head;
        String s = "";
        while (curr != null) {
            s = s + " " + curr.value;
            curr = curr.next;
        }
        return s;
    }
}
