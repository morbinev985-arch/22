package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{
    private static final int FIXED_PRICE = 1000;

    public FixPriceProduct(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return getTitle() + "Фиксированная цена" + FIXED_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public int getPrise() {
        return FIXED_PRICE;
    }
}
