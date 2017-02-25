package pl.sda.mvc.controller;

import pl.sda.mvc.model.Model;

import java.util.List;
import java.util.Random;

/**
 * Created by m.losK on 2017-02-25.
 */
public class Controller {

    //TODO: podmien randoma na Fibonacciego
    public int getFibValue(int number) {
        Random random = new Random();
        int randomValue = random.nextInt(20000);
        Model.addValue(randomValue);
        return randomValue;
    }

    public double average() {
        double sum = 0;

        List<Integer> values = Model.getValues();

        for (int value : values) {
            sum += value;
        }
        return sum / values.size();
    }
}
