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

        ArrayList<Integer> array = new ArrayList<Integer>();
        LinkedList<Integer> linked = new LinkedList<Integer>();

        LocalTime start;
        LocalTime finish;

        System.out.println("N: " + N + "\n");

        System.out.println("add: ");
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            array.add(i^2);
        finish = LocalTime.now();
        System.out.println("ArrayList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );

        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            linked.add(i^2);
        finish = LocalTime.now();
        System.out.println("LinkedList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano())+ "\n" );


        System.out.println("get: ");
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            array.get(i);
        finish = LocalTime.now();
        System.out.println("ArrayList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );

        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            linked.get(i);
        finish = LocalTime.now();
        System.out.println("LinkedList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) + "\n");


        System.out.println("remove: ");
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
        array.remove(0);
        finish = LocalTime.now();
        System.out.println("ArrayList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );

        start = LocalTime.now();
        for (int i = 0; i < N; i++)
        linked.remove(0);
        finish = LocalTime.now();
        System.out.println("LinkedList: " + (finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()) );
    }

}