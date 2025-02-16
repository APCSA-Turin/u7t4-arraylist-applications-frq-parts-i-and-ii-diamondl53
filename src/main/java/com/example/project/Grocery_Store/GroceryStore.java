package com.example.project.Grocery_Store;
import java.util.ArrayList;
public class GroceryStore {
    /** An array of products normally stocked at the grocery store
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private Product[] productsStocked;

    public GroceryStore(Product[] initialInventory) {
        productsStocked = initialInventory;
    }

    /** Returns an ArrayList of indices for Product elements in the
     *  productsStocked array that need to be reordered, as described in part (a)
     *  Precondition: min > 0 */
    public ArrayList<Integer> getReorderList(int min) {
        /* to be implemented in part (a) */
        ArrayList<Integer> needsReordering = new ArrayList<Integer>();
        for(int i = 0; i < productsStocked.length; i++){
            if(productsStocked[i].getQuantity()<=min){
                needsReordering.add(i);
            }
        }
        return needsReordering;
    }

    /** Returns true if all products named in shoppingList are available for purchase
     *  and returns false otherwise, as described in part (b)
     *  Precondition: The products named in shoppingList are found exactly once
     *  in the productsStocked array.
     */
    public boolean checkAvailability(ArrayList<String> shoppingList) {
        /* to be implemented in part (b) */
        boolean isFound;
        for(int i = 0; i < shoppingList.size(); i++){
            isFound = false;
            for(int k = 0; k < productsStocked.length; k++){
                if(productsStocked[k].getName().equals(shoppingList.get(i))){
                    if(productsStocked[k].getQuantity() > 0){
                        isFound = true;
                        break;
                    }
                }
            }
            if(!isFound){
                return false;
            }
        }
        return true;
    }
}