package org.sample;

public class Check {
    private String CashierName;
    private Order TotalOrder;
    private boolean Account;

    public Check(String Cashier, Order TotalOrder, boolean Account) {
        this.CashierName = Cashier;
        this.TotalOrder = TotalOrder;
        this.Account = Account;
    }

    public String getCashierName() {
        return this.CashierName;
    }

    public Order getTotalOrder() {
        return this.TotalOrder;
    }

    public boolean getAccount() {
        return this.Account;
    }
}
