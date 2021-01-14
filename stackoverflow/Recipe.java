import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {

  ArrayList<String> ingredientList = new ArrayList<>();
  ArrayList<Double> costPerServing = new ArrayList<>();

  double price;
  boolean quit = true;

  Scanner keyboard = new Scanner(System.in);

  public void createRecipe(){

    while(quit)
    {
        addNewIngredient();
    }

    System.out.println("Enter your price for the menu item.");
    price = keyboard.nextDouble();

  }
  public void addNewIngredient(){

    System.out.println("Enter an Ingredient");
    ingredientList.add(keyboard.nextLine());
    System.out.println();

}
}

