package pl.sda.adapter;

import pl.sda.builder.*;

/**
 * Created by m.losK on 2017-02-27.
 */
public class PersonImpl implements Person {
    @Override
    public void move() {
        System.out.println("I'm going!");
    }

    @Override
    public void say() {
        System.out.println("I'm saying: Bla bla");
    }
}
