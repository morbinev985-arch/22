package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private final int prise;

    public SimpleProduct(String title, int prise) {
        super(title);
        this.prise = prise;
    }

    @Override
    public int getPrise() {
        return prise;
    }

    @Override
    public String getTitle() {
        return super.getTitle()+ ": " + getPrise();
    }
}
