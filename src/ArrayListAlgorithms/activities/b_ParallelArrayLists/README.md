# Activity 2: Recipe Manager

## Overview
You'll create a recipe management system that maintains parallel lists of ingredients and their quantities. This system will help track and modify cooking recipes.

## Background
The system uses two synchronized ArrayLists:
- ingredients: stores ingredient names (String)
- amounts: stores corresponding quantities (double)
For example, "flour" at index 0 might correspond to 2.5 (cups) at index 0 in amounts.

## Your Tasks
Implement the following methods in RecipeManager.java:

1. `addIngredient(String ingredient, double amount)`: Add new ingredient with its amount
2. `scaleRecipe(double factor)`: Multiply all amounts by a factor (for serving size adjustments)
3. `getShoppingList()`: Get list of ingredients needed in "amount ingredient" format
4. `combineRecipe(RecipeManager other)`: Merge another recipe's ingredients (add amounts for duplicates)
5. `removeIngredient(String ingredient)`: Remove an ingredient and its amount

## Testing Your Code
Test with:
- Adding various ingredients
- Scaling recipes up and down
- Combining recipes with/without overlapping ingredients
- Removing existing and non-existing ingredients

## Tips
- Always maintain synchronization between the two lists
- Consider case-sensitivity in ingredient names
- Handle decimal precision appropriately 