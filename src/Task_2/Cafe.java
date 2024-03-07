package Task_2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {
        try {
            File file = new File("C:\\Users\\Bruger\\Documents\\ItelleJ\\untitled\\src\\Task_2\\coffees.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String coffee = scanner.nextLine();
                coffeeMenu.add(coffee);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
}
