package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    public static final int MAX_PRODUCTS = 5;
    private final Product[] products;

    public static final int NOT_FOUND = -1;

    public ProductBasket() {
        products = new Product[MAX_PRODUCTS];
    }

    public void add(Product product) {
        int freeIndex = getFreeIndex();
        if (freeIndex == NOT_FOUND) {
            System.out.println("невозможно добавить продукт \"" + product.getTitle() + "\"");
            return;
        }
        products[freeIndex] = product;
    }

    public int getTotalCost() {
        int sum = 0;
        for (Product product : products) {
            if (product != null) {
                sum += product.getPrice();
            }
        }
        return sum;
    }

    public void print() {
        if (getProductCount() <= 0) {
            System.out.println("в корзине пусто");
            return;
        }

        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
        System.out.println("итого: " + getTotalCost());
        System.out.println("специальных товаров: " + getSpecialProductCount());
    }

    public boolean findByTitle(String title) {
        for (Product product : products) {
            if (product != null && product.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(products, null);
    }

    public int getSpecialProductCount() {
        int count = 0;
        for (Product product : products) {
            if (product != null) {
                if (product.isSpescial()) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getFreeIndex() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return NOT_FOUND;
    }

    private int getProductCount() {
        int count = 0;
        for (Product product : products) {
            if (product != null) {
                count++;
            }
        }
        return count;
    }
}


