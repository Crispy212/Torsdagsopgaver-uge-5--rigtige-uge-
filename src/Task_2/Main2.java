package Task_2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        cafe.loadMenuData();

        for (String coffee : cafe.coffeeMenu) {
            System.out.println(coffee);
        }

    }
}
