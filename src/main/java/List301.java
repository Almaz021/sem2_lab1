public interface List301 {
    void add(Integer e) throws EmptyElementException;

    void delete(int index) throws IndexOutOfBoundsException;

    Integer pop() throws IndexOutOfBoundsException;

    Integer get(int index);

    int size();
}