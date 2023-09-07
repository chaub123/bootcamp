package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float sum = 0.0f;
        for(Furniture key : ordersOfFurnitures.keySet()){
            sum += getTypeCount(key) * key.cost();
        }
        return sum;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return ordersOfFurnitures.getOrDefault(type, 0);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return getTypeCount(type) * type.cost() ;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int sum = 0;
        for(Furniture key : ordersOfFurnitures.keySet()){
            sum += getTypeCount(key);
        }
        return sum;
    }
}