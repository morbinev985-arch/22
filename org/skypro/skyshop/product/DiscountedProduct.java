package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private final int basePrise;
    private final int discount;

    public DiscountedProduct(String title, int basePrise,int discount) {
        super(title);
        this.basePrise = basePrise;
        this.discount = discount;
    }

    @Override
    public int getPrise() {
        return basePrise - (int)((double)(basePrise * discount)/100.0);
    }

    @Override
    public boolean isSpescial() {
        return true;
    }

    @Override
    public String toString() {
        return super.getTitle()+ ": " + getPrise() + "(скидка " + discount + "%)";
    }
}
