import java.util.*;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class FractionalKnapsack {
    public static double getMaxValue(int[] weights, int[] values, int capacity) {
        Item[] items = new Item[weights.length];

        // Create items array with weights and values
        for (int i = 0; i < weights.length; i++) {
            items[i] = new Item(weights[i], values[i]);
        }

        // Sort items in descending order of value per unit weight
        Arrays.sort(items, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());

        double totalValue = 0;
        int remainingCapacity = capacity;

        for (Item item : items) {
            if (remainingCapacity <= 0) {
                break; // Knapsack is full
            }

            int weight = Math.min(item.weight, remainingCapacity); // Take either the full item or a fraction of it
            double valuePerUnitWeight = (double) item.value / item.weight;
            double contribution = valuePerUnitWeight * weight;

            totalValue += contribution;
            remainingCapacity -= weight;
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;

        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}

