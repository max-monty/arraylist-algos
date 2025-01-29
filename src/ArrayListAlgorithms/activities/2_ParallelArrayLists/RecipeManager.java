import java.util.ArrayList;

public class RecipeManager {
    private ArrayList<String> ingredients;
    private ArrayList<Double> amounts;
    
    public RecipeManager() {
        ingredients = new ArrayList<>();
        amounts = new ArrayList<>();
    }
    
    public void addIngredient(String ingredient, double amount) {
        // TODO: Add ingredient and its amount
        // If ingredient exists, update its amount instead
    }
    
    public void scaleRecipe(double factor) {
        // TODO: Multiply all amounts by factor
        // Handle negative factors appropriately
    }
    
    public ArrayList<String> getShoppingList() {
        // TODO: Return list of strings in format "amount ingredient"
        // Example: "2.5 cups flour"
        return new ArrayList<>();
    }
    
    public void combineRecipe(RecipeManager other) {
        // TODO: Add all ingredients from other recipe
        // Add amounts for duplicate ingredients
    }
    
    public void removeIngredient(String ingredient) {
        // TODO: Remove ingredient and its amount
        // Do nothing if ingredient not found
    }
    
    // Helper method for testing
    public boolean hasIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }
    
    // Helper method for testing
    public double getAmount(String ingredient) {
        int index = ingredients.indexOf(ingredient);
        return index >= 0 ? amounts.get(index) : -1;
    }
} 