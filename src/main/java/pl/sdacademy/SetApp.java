package pl.sdacademy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
public class SetApp {

    public static void main(String[] args) {
        Set<Car> hashSet = new HashSet<>();
        Set<Car> treeSet = new TreeSet<>();
        Set<Car> linkedHashSet = new LinkedHashSet<>();

        addCarsToSet(hashSet);
        addCarsToSet(treeSet);
        addCarsToSet(linkedHashSet);

        System.out.println("Samochody z hash set:");
        showCarsFromSet(hashSet);
        System.out.println("Samochody z tree set:");
        showCarsFromSet(treeSet);
        System.out.println("Samochody z linked hash set:");
        showCarsFromSet(linkedHashSet);
    }

    //metoda wyświetla wszystkie samochody ze zbioru
    private static void showCarsFromSet(Set<Car> set) {

    }

    //metoda dodaje 5 samochodów do zbioru
    private static void addCarsToSet(Set<Car> set) {

    }


}
