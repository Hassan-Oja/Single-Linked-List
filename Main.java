public class Main {
    public static void main(String[] args) {
        singel_LL s1 = new singel_LL();

        System.out.println(s1.isEmpty());
        System.out.println("");

        s1.insertfirst(10);
        s1.insertlast(20);
        s1.insertfirst(5);
        s1.insertlast(30);
        s1.insertpos(7,1);
        s1.insert_sort(15);
        s1.insert_sort(25);
        s1.display();
        System.out.println("");


        System.out.println(s1.count());
        System.out.println("");

        System.out.println(s1.getLen());
        System.out.println("");

        System.out.println(s1.search(10));
        System.out.println(s1.search(35));
        System.out.println("");

        s1.printMiddle();
        System.out.println("");

        s1.delete_last();
        System.out.println(s1.delete_pos(1));
        s1.delete_first();
        s1.display();
        System.out.println("");

        System.out.println(s1.reverse());
        System.out.println("");

        System.out.println(s1.sum());
        System.out.println("");

        s1.clear();
        s1.display();

    }
}