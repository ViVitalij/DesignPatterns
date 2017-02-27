package pl.sda.mvc.view;

import pl.sda.mvc.controller.Controller;

import java.util.Scanner;

/**
 * Created by m.losK on 2017-02-25.
 */
public class View {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            Integer choice = in.nextInt();
            Controller controller = new Controller();
            if (choice != null && choice > 0) {
                long result = controller.getFibValue(choice);
                System.out.println("FIB = " + result);
            } else {
                System.out.println("AVG = " + controller.average());
            }
        }
    }
}
