import java.util.ArrayList;
import java.util.LinkedList;
import java.time.LocalTime; //библиотека джава со временем(имеет нано секунды)

/**
 * Сравнение производительности ArrayList и LinkedList
 */
public class Main {
    /**
     * вызов метода (кол-во раз)
     */
    private static int N = 10000;

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        LocalTime start;
        LocalTime finish;

        System.out.println("N: " + N + "\n");

        System.out.println("add: ");
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            arrayList.add(i^2);
        finish = LocalTime.now();
        System.out.println("ArrayList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );

        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            list.add(i^2);
        finish = LocalTime.now();
        System.out.println("LinkedList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano())+ "\n" );


        System.out.println("get: ");
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            arrayList.get(i);
        finish = LocalTime.now();
        System.out.println("ArrayList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );

        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            list.get(i);
        finish = LocalTime.now();
        System.out.println("LinkedList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) + "\n");


        System.out.println("remove: ");
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
        arrayList.remove(0);
        finish = LocalTime.now();
        System.out.println("ArrayList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );

        start = LocalTime.now();
        for (int i = 0; i < N; i++)
        list.remove(0);
        finish = LocalTime.now();
        System.out.println("LinkedList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );
    }

}