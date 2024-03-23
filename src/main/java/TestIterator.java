public class TestIterator {
    public static void main(String[] args) throws EmptyElementException {
        MyList<String> l = new MyList<>();
        for (int i = 0; i < 13; i++) {
            l.add(String.valueOf(i));
        }
        System.out.println(l);
        try {
            MyList.iterator<String> iter = new MyList.iterator<>();
            for (int i = 0; i < 13; i++) {
                if (iter.hasNext()) {
                    System.out.println(iter.next());
//                    iter.remove();
                }
            }
            iter = new MyList.iterator<>();
            iter.next();
            System.out.println(iter.next());
            iter.forEachRemaining(new MyList.Printer());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
