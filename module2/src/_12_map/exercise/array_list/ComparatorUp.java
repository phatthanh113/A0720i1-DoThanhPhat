package _12_map.exercise.array_list;

import java.util.Comparator;

public class ComparatorUp implements Comparator<Product> {
    @Override
    public int compare(Product product, Product otherProduct) {
        return product.getPrice()-otherProduct.getPrice();
    }
}

