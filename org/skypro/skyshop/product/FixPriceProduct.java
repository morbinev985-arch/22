package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{
    private final static int PRICE = 1000;

    public FixPriceProduct(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return getTitle() + "Фиксированная цена" + PRICE;
    }

    @Override
    public boolean isSpescial() {
        return true;
    }

    @Override
    public int getPrise() {
        return PRICE;
    }
}
