package pl.sda.singleton;

/**
 * Created by m.losK on 2017-02-25.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public String getName() {
        return "Singleton";
    }
}
