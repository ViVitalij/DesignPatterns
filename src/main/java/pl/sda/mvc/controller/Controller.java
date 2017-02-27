package pl.sda.mvc.controller;

import algorithms.fibonacci.Fibonacci;
import algorithms.fibonacci.factory.FibonacciFactory;
import pl.sda.mvc.model.Model;

import java.util.List;

/**
 * Created by m.losK on 2017-02-25.
 */
public class Controller {

    public long getFibValue(int number) {
        long fibValue = FibonacciFactory.produce(Fibonacci.FibonacciEnum.FIBITERATIVE).getNumber(number);
        Model.addValue(fibValue);
        return fibValue;
    }

    public double average() {
        double sum = 0;

        List<Long> values = Model.getValues();

        for (long value : values) {
            sum += value;
        }
        return sum / values.size();
    }
}
