package com.menuupdate;

import com.Billing.app.repository.FoodRepository;
import com.Billing.app1.BillGenerator;

import databaseconnection.Database;

import java.sql.SQLException;
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        // Connect to the database
        String url = "jdbc:mysql://localhost:3306/set_db";
        String username = "root";
        String password = "root";

        try {
            Database database = new Database(url, username, password);
            database.connect();

            // Create a food repository
            FoodRepository foodRepository = new FoodRepository();

            // Create a bill generator
            BillGenerator billGenerator = new BillGenerator(foodRepository);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of food items you want to purchase:");
            int numItems = scanner.nextInt();

            int[] purchasedItems = new int[numItems];

            for (int i = 0; i < numItems; i++) {
                System.out.println("Enter the Srno for item " + (i + 1) + ":");
                purchasedItems[i] = scanner.nextInt();
            }

            billGenerator.generateBill(purchasedItems);
            scanner.close();

         
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
