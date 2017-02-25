package pl.sda.observer;

/**
 * Created by m.losK on 2017-02-25.
 */
public class Observer {
    public void  react(int value){
        System.out.println("Value " + value + " has been changed by an observer from DesignPatterns' project for " + Math.abs(value));
    }
}
