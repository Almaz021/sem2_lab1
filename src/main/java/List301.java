public interface List301<T> {
    void add(T e) throws EmptyElementException;

    static void delete(int index) throws IndexOutOfBoundsException {}

    Object pop() throws IndexOutOfBoundsException;

    Object get(int index);

    int size();
}