package pl.sda.adapter;

/**
 * Created by m.losK on 2017-02-27.
 */
public class CarImpl implements Car {
    @Override
    public void drive() {
        System.out.println("Out of the way!");
    }

    @Override
    public void horn() {
        System.out.println("Beeeeeep!");
    }
}
