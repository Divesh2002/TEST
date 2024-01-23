/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diet;
  import java.util.ArrayList;
import java.util.List;

public class Diet {
    private List<FoodItem> foodItems;

    // Constructor
    public Diet() {
        this.foodItems = new ArrayList<>();
    }

    // Method to add a food item to the diet
    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    // Method to calculate total calories in the diet
    public Calorie calculateTotalCalories() {
        Calorie totalCalories = new Calorie(0);

        for (FoodItem foodItem : foodItems) {
            totalCalories.addCalories(foodItem.getCalories().getValue());
        }

        return totalCalories;
    }

    // Other methods as needed

    @Override
    public String toString() {
        return "Diet{" +
                "foodItems=" + foodItems +
                '}';
    }
}
