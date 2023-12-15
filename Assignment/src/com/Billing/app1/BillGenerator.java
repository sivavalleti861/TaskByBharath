package com.Billing.app1;

import com.Billing.app.Model.FoodItem;
import com.Billing.app.repository.FoodRepository;

public class BillGenerator {
    private FoodRepository foodRepository;

    public BillGenerator(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public void generateBill(int[] itemIds) {
        double totalAmount = 0;
        StringBuilder itemsList = new StringBuilder();

        for (int itemId : itemIds) {
            FoodItem item = foodRepository.getFoodItemBySrno(itemId);
            if (item != null) {
                totalAmount += item.getPrice();
                itemsList.append(item.getItemName()).append(" - $").append(item.getPrice()).append("\n");
            }
        }

        // Display the bill
        System.out.println("Items Purchased:");
        System.out.println(itemsList);
        System.out.println("Total Amount: $" + totalAmount);
    }
}
