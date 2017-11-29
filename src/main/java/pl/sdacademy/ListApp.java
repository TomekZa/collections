package pl.sdacademy;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class ListApp {

    private static final int LIST_SIZE = 100_000;

    public static void main( String[] args ) {
        List<Integer> arrayList = createArrayList();
        List<Integer> linkedList = createLinkedList();

        readAllElements(arrayList, "Czas czytania array list: ");
        readAllElements(linkedList, "Czas czytania linked list: ");

        deleteElements(arrayList, "Czas usuwania z array list: ");
        deleteElements(linkedList, "Czas usuwania z linked list: ");
    }

    private static void readAllElements(List<Integer> list, String message) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            Integer number = list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(message + (endTime - startTime));
    }

    private static void deleteElements(List<Integer> list, String message) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            Integer number = list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(message + (endTime - startTime));
    }

    //metoda tworzy LinkedList i wypełnia ją kolejnymi wartościami
    //mierzy czas wypełnienia
    private static List<Integer> createLinkedList() {
        LinkedList<Integer> result = new LinkedList<>();
        fillList(result, "Czas wypelnienia linked list: ");
        return result;
    }

    //metoda tworzy LinkedList i wypełnia ją kolejnymi wartościami
    //mierzy czas wypełnienia
    private static List<Integer> createArrayList() {
        ArrayList<Integer> result = new ArrayList<>();
        fillList(result, "Czas wypelnienia array list: ");
        return result;
    }

    private static void fillList(List<Integer> list, String message) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(message + (endTime - startTime));
    }

}
