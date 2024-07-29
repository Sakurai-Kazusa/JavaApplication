package org.sample;

public class Product {
    private int Price;
    private Menu ProductName;
    private Category CategoryName;
    private static int ProductId;
    private static int CategoryId;

    public Product(Menu ProductName, Category CategoryName, int Price) {
        this.ProductName = ProductName;
        this.CategoryName = CategoryName;
        this.Price = Price;
        ProductId++;
        CategoryId++;
    }

    public Menu getProductName() {
        return this.ProductName;
    }

    public Category getCategoryName() {
        return this.CategoryName;
    }

    public int getPrice() {
        return this.Price;
    }

    public static int getProductId() {
        return ProductId;
    }

    public static int getCategoryId() {
        return CategoryId;
    }
}
