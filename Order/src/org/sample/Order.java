package org.sample;

import java.util.List;

public class Order {
    private Table PlaceOFOrder;
    private String OrderingPersonName;
    private List<Product> OrderedGoods;
    private int EmployeeId;
    private int OrdererNumber;
    private static int Customer;


    public Order(Table PlaceOFOrder, String OrderingPersonName, List<Product> OrderedGoods, int EmployeeId, int OrderNumber) {
        this.PlaceOFOrder = PlaceOFOrder;
        this.OrderingPersonName = OrderingPersonName;
        this.OrderedGoods = OrderedGoods;
        this.EmployeeId = EmployeeId;
        this.OrdererNumber = OrderNumber;
        Customer++;
    }

    public Table getPlaceOFOrder() {
        return this.PlaceOFOrder;
    }

    public List<Product> getOrderedGoods() {
        return this.OrderedGoods;
    }

    public String getOrderingPersonName() {
        return this.OrderingPersonName;
    }

    public int getOrdererNumber() {
        return this.OrdererNumber;
    }

    public int getCustomer() {
        return Customer;
    }

    public int getTotalPrice(List<Product> OrderedGoods) {
        int TotalPrice = 0;

        for (Product orderedGood : OrderedGoods) {
            TotalPrice = TotalPrice + orderedGood.getPrice();
        }
        return TotalPrice;
    }

    @Override
    public String toString() {
        String string = "";
        string = string + "伝票番号" + this.OrdererNumber + "\n";
        string = string + "対応従業員" + EmployeeList.getById(EmployeeId) + "\n";
        return string;
    }
}
