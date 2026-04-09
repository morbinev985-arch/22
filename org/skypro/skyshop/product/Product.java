package org.skypro.skyshop.product;

public abstract class Product {
    private final String title;

    public Product(String title, int price) {
        this.title = title;
    }

    public abstract int getPrise();

    public String getTitle() {
        return title;
    }

    public boolean isSpescial() {
        return false;
    }

    @Override
    public String toString() {
        return title;
    }
}


