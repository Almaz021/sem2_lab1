public class MyList implements List301 {
    Integer[] lst = new Integer[10];
    int size = 0;

    MyList() {}

    MyList(int[] arr) {
        if (arr != null) {
            this.lst = new Integer[arr.length];
            for (int i = 0; i < arr.length; i++) {
                lst[i] = arr[i];
            }
            size = arr.length;
        }
    }

    public Integer findFirst(int x) {
        for (int i = 0; i < size; i++) {
            if (lst[i] == x) {
                return i;
            }
        }
        return null;
    }

    public void deleteAll(int x) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (lst[i] == x) {
                lst[i] = null;
                count++;
            }
        }
        Integer[] nlst = new Integer[size - count];
        count = 0;
        for (int i = 0; i < size; i++) {
            if (lst[i] != null) {
                nlst[i - count] = lst[i];
            }
            else {
                count++;
            }
        }
        this.lst = nlst;
        this.size -= count;

    }

    public void add(Integer e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        if (lst.length == size) {
            Integer[] nlst = new Integer[2 * size()];
            System.arraycopy(lst, 0, nlst, 0, lst.length);
            lst = nlst;
        }
        lst[size++] = e;
    }


    public void delete(int index) throws IndexOutOfBoundsException {
        if (size > index) {
            for (int i = index; i < size - 1; i++) {
                lst[i] = lst[i + 1];
            }
            lst[--size] = null;

        } else {
            throw new IndexOutOfBoundsException("del err");
        }
    }


    public Integer pop() {
        if (size > 0) {
            int el = lst[size - 1];
            lst[size - 1] = null;
            size--;
            return el;
        } else {
            return null;
        }
    }


    public Integer get(int index) {
        if (index < size) {
            return lst[index];
        }
        return null;
    }


    public int size() {
        return size;
    }

    public String toString() {
        String s = "";
        for (Integer integer : lst) {
            s = s + " " + integer;
        }
        return s;
    }
}
