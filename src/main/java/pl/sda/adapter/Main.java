package pl.sda.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m.losK on 2017-02-27.
 */
public class Main {
    /**
     * with adapter
     */
    public static void main3(String[] args) {
        Car car = new CarImpl();
        Person person = new PersonImpl();

        CarToPersonAdapter carToPersonAdapter = new CarToPersonAdapter(car);
        List<Person> personsList = new ArrayList<>();

        personsList.add(person);
        personsList.add(carToPersonAdapter);

        for (Person personFromList : personsList) {
            personFromList.move();
            personFromList.say();
        }
    }

    /**
     * without adapter
     */
    public static void main2(String[] args) {
        Car car1 = new CarImpl();
        Car car2 = new CarImpl();

        Person person1 = new PersonImpl();
        Person person2 = new PersonImpl();

        List<Person> personsList = new ArrayList<>();
        personsList.add(person1);
        personsList.add(person2);

        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);

        for (Person person :
                personsList) {
            person.move();
            person.say();
        }

        for (Car car : carsList) {
            car.drive();
            car.horn();
        }
    }

    /**
     * using PersonToCarAdapter
     */

    public static void main(String[] args) {
        Car car = new CarImpl();
        Person person = new PersonImpl();

        PersonToCarAdapter personToCarAdapter = new PersonToCarAdapter(person);
        List<Car> carsList = new ArrayList<>();

        carsList.add(car);
        carsList.add(personToCarAdapter);

        for (Car carFromList : carsList) {
            carFromList.horn();
            carFromList.drive();
        }
    }
}
