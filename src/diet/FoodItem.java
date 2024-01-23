/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diet;

/**
 *
 * @author x23156821
 */
public class FoodItem {
    private final String name;
    private final Calorie calories;

    // Constructor
    public FoodItem(String name, int caloriesValue) {
        this.name = name;
        this.calories = new Calorie(caloriesValue);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for calories
    public Calorie getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
