package com.ice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class McDonlds {
    Map<String, Item> menu = new HashMap<>();
    public McDonlds() {
        File file = new File("mcdonlds.txt");

        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                Item item = new Item(
                        tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3]));
                menu.put(item.id, item);
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("讀取menu失敗");
        }
    }

    public void printMenu() {
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
            System.out.println(itemEntry.getValue());
        }
    }

    public static void main(String[] args) {
        McDonlds mcDonlds = new McDonlds();
        mcDonlds.printMenu();
    }
}

class Item {
    String id;
    String name;
    int calorie;
    int price;

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + calorie + "\t" + price;
    }

    public Item(String id, String name, int calorie, int price) {
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
