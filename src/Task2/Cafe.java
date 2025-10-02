package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;

    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        File file = new File("coffees.txt");  // file should be in project root

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String coffeeName = scan.nextLine();
                coffeeMenu.add(coffeeName);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename.");
            e.printStackTrace();
        }
    }
}

