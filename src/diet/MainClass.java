package diet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author x23156821
 */
public class MainClass {
    public static void main(String[] args) {
        // Creating an instance of Diet
        Diet diet = new Diet();

        // Displaying the diet and total calories (without specific FoodItems)
        System.out.println("Diet: " + diet);
        System.out.println("Total Calories: " + diet.calculateTotalCalories());
    }
}

