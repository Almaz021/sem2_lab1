public class Test {
    public static void main(String[] args) {
//        MyList l = new MyList();
//        try {
//            // Добавление
//            for (int i = 0; i < 13; i++) {
//                l.add(i);
//                System.out.println(l.size());
//                System.out.println(l);
//            }
//            // Получение эл-та
//            System.out.println(l.get(5));
//            // Удаление последнего
//            System.out.println(l.pop());
//            l.pop();
//            System.out.println(l);
//            // Удаление по индексу
//            l.delete(5);
//            System.out.println(l);
//        } catch (EmptyElementException e) {
//            System.out.println("ERROR!");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }

        LinkedList<Integer> link = new LinkedList<Integer>();
        try {
//            Добавление
            for (int i = 0; i < 13; i++) {
                link.add(i);
                System.out.println(link.size());
                System.out.println(link);
            }
            System.out.println(link.get(6));
            link.pop();
            System.out.println(link.pop());
            System.out.println(link);
            link.delete(6);
            System.out.println(link);


        } catch (EmptyElementException e) {
            System.out.println("ERROR!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] a = {1, 2, 3, 2, 3, 2, 5, 7, 2, 0, -1};
            MyList<Integer> lst = new MyList<Integer>(a);
            lst.add(4);
            System.out.println(lst);
            System.out.println(lst.findFirst(0));
            lst.deleteAll(2);
            System.out.println(lst);
            lst.deleteAll(3);
            System.out.println(lst);
        } catch (EmptyElementException e) {
            System.out.println("ERROR!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}

// List (int[] arr)
// int find first(int x) -> position
// deleteAll(int x) - удаление все элементы x
