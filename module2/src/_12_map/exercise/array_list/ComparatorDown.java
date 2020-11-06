package _12_map.exercise.array_list;

import java.util.Comparator;
import java.util.Comparator;
public class ComparatorDown implements Comparator<Product> {
    @Override
    public int compare(Product product, Product otherProduct) {
        return otherProduct.getPrice() - product.getPrice();
    }
}
