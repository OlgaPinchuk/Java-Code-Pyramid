/**
 * Note:
 * This file is excluded is not formatted on purpose to compare the lack of formatting.
 * It also ignores the code enhancement that Intelli-J idea suggest.
 * To see the difference, create a new branch and format the code and click on the warning icon on the top right.
 */

package part_1_readable_bad;

import java.util.List;

public class Project {
    String currency = "usd";
    List<InventoryItem> inventory = List.of(
            new InventoryItem("Flashlight", "🔦", "A really great flashlight", 100, 1, "usd"),
            new InventoryItem("Tin can", "🥫", "Pretty much what you would expect from a tin can", 32, 2, "usd"),
            new InventoryItem("Cardboard Box", "📦", "It holds things", 5, 3, "usd")
    );

    public Project() {
        printHeader();
        printTable();
    }
    public void printHeader() {
        System.out.println("1 Readable Bad ❌");
        System.out.println("Global currency: " + currency);
    }
    public void printTable() {
        String rowSize = "| %-15s | %-5s | %-50s | %-5d |%n";

        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");
        System.out.format("| Product         | Image | Description                                        | Price |%n");
        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");

        for (InventoryItem item : inventory) {
            System.out.format(rowSize, item.name(), item.img(), item.desc(), item.price());
        }

        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");

    }
}