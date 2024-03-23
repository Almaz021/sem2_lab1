public class LinkedList<T> implements List301<T> {
    Node<T> head;
    int size = 0;

    public void add(T e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        if (head == null) {
            head = new Node<T>();
            head.value = e;
        } else {
            Node<T> current = head;
            Node<T> n = new Node<T>();
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
            Node<T> curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            size--;
        } else {
            throw new IndexOutOfBoundsException("del err");
        }
    }

    public T pop() throws IndexOutOfBoundsException {
        Node<T> curr = head;
        if (head != null) {
            if (head.next == null) {
                T el = head.value;
                head = null;
                size--;
                return el;
            }
            while (true) {
                if (curr.next.next == null) {
                    T el = curr.next.value;
                    curr.next = null;
                    size--;
                    return el;
                }
                curr = curr.next;
            }
        }
        throw new IndexOutOfBoundsException("pop err");
    }

    public T get(int index) {
        Node<T> curr = head;
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
        Node<T> curr = head;
        String s = "";
        while (curr != null) {
            s = s + " " + curr.value;
            curr = curr.next;
        }
        return s;
    }
}
