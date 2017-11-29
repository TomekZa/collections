package pl.sdacademy;

import java.util.*;

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
        //wersja wykorzystująca iterator
        Iterator<Car> iterator = set.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }
        /*
        //wersja z pętlą for-each
        for (Car car : set) {
            System.out.println(car);
        }
        */
    }

    //metoda dodaje 5 samochodów do zbioru
    private static void addCarsToSet(Set<Car> set) {
        set.add(new Car("Toyota", "Avensis"));
        set.add(new Car("Daewoo", "Tico"));
        set.add(new Car("Mitsubishi", "L200"));
        set.add(new Car("Mazda", "6"));
        set.add(new Car("Kia", "Stingray"));
        set.add(new Car("Toyota", "Camry"));
    }
/*
    Daewoo Tico
    Kia Stingray
    Mazda 6
    Mitsubishi L200
    Toyota Avensis, Camry
*/
}
