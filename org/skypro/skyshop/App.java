package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.Arrays;

public class App {
    public static  void  main(String[] args) {

        Product bananas = new SimpleProduct("бананы", 200);
        Product oranges = new FixPriceProduct("апельсины", 150);
        Product water = new FixPriceProduct("вода", 120);
        Product cookies = new DiscountedProduct("печенье", 150);
        Product fish = new DiscountedProduct("рыба", 500);
        Product beer = new SimpleProduct("пиво", 300);

        ProductBasket basket = new ProductBasket();

        basket.add(bananas);
        basket.add(water);
        basket.add(oranges);
        basket.add(cookies);
        basket.add(fish);

        basket.add(beer);
        basket.print();

        System.out.println("стоимость корзины: " + basket.getTotalCost());
        System.out.println("поиск товара\"" + bananas.getTitle()+"\" в корзине:" + basket.findByTitle);
        System.out.println("поиск товара \"" + beer.getTitle()+"\" в корзине:" + basket.findByTitle);
        basket.clear();
        basket.print();
        System.out.println("стоимость пустой корзины" + basket.getTotalCost());
        System.out.println("поиск товара\"" + bananas.getTitle()+ "\" в корзине: " + basket.findByTitle);

        SearchEngine searchEngine = new SearchEngine();
        searchEngine.addAll(bananas, oranges, water, cookies, fish, beer);

        Article bananasArticle = new Article ("статья о бананах", "Банан это плод ");
        Article orangesArticle = new Article ("статья о апельсинах", "Апельсин - это цитрусовый фрукт ");

        searchEngine.addAll(bananasArticle, orangesArticle);

        String searchQuery1 = "Банана";
        System.out.println("поиск \"" + searchQuery1 + "\": " + Arrays.toString(searchEngine.search(searchQuery1)));
        String searchQuery2 = "Рыба";
        System.out.println("поиск \"" + searchQuery1 + "\": " + Arrays.toString(searchEngine.search(searchQuery2)));
        String searchQuery3 = "стакан";
        System.out.println("поиск \"" + searchQuery1 + "\": " + Arrays.toString(searchEngine.search(searchQuery3)));
    }
}
