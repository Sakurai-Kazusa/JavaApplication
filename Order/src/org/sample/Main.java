package org.sample;

import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        List<Product> ProductList = new ArrayList<>();

        Product CafeLatte = new Product(Menu.CafeLatte, Category.DRINK, 500);
        Product CafeAuLit = new Product(Menu.CafeAuLait, Category.DRINK, 400);
        Product Tea = new Product(Menu.Tea, Category.DRINK, 300);
        Product SandWich = new Product(Menu.SandWich, Category.SNACK, 600);
        Product Cake = new Product(Menu.Cake, Category.DESSERT, 500);
        Product Scone = new Product(Menu.Scone, Category.SNACK, 400);

        ProductList.add(CafeLatte);
        ProductList.add(CafeAuLit);
        ProductList.add(Tea);
        ProductList.add(SandWich);
        ProductList.add(Cake);
        ProductList.add(Scone);

        Table table = new Table(1);

        Order order = new Order(table,"Yamada", ProductList,2, 2);

        out.println("注文メニュー:");
        out.println(CafeLatte.getProductName());
        out.println(CafeLatte.getCategoryName());
        out.println("卓番:" + order.getPlaceOFOrder());
        out.println("人数" + order.getCustomer());
        out.println(order.getTotalPrice(ProductList));
    }
}