package com.Billing.app.repository;

import java.util.ArrayList;
import java.util.List;

import com.Billing.app.Model.FoodItem;

public class FoodRepository {
	private List<FoodItem> foodItems;

	public FoodRepository() {
		this.foodItems = new ArrayList<>();
		foodItems.add(new FoodItem(1, "Dosa", 30));
		foodItems.add(new FoodItem(2, "Idly", 20));
		foodItems.add(new FoodItem(3, "Biryani", 250));
		foodItems.add(new FoodItem(4, "chapathi", 70));
		foodItems.add(new FoodItem(5, "meals", 100));
		foodItems.add(new FoodItem(6, "fired rice", 150));

	}

	public List<FoodItem> getAllFoodItems() {
		return foodItems;
	}

	public FoodItem getFoodItemBySrno(int srno) {
		for (FoodItem item : foodItems) {
			if (item.getSrno() == srno) {
				return item;//
			}
		}
		return null;
	}
}