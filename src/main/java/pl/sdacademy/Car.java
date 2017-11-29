package pl.sdacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
@AllArgsConstructor
@Getter
@Setter
public class Car implements Comparable<Car> {

    private String manufacturer;
    private String model;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (manufacturer != null ? !manufacturer.equals(car.manufacturer) : car.manufacturer != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Car otherCar) {
        int manufacturerCompare = manufacturer.compareTo(otherCar.manufacturer);
        if (manufacturerCompare != 0) {
            return manufacturerCompare;
        } else {
            return model.compareTo(otherCar.model);
        }
    }

    @Override
    public String toString() {
        return manufacturer + " " + model;
    }
}
