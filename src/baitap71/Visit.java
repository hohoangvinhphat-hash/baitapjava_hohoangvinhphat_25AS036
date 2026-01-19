package baitap71;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }

    public double getTotalExpense() {
        double serviceDiscount = 0;
        double productDiscount = 0;

        if (customer.isMember()) {
            serviceDiscount = serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
            productDiscount = productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType());
        }

        return (serviceExpense - serviceDiscount) + (productExpense - productDiscount);
    }

    // Helper method để thiết lập thành viên cho khách hàng trong Visit
    public void setCustomerMember(boolean isMember, String type) {
        customer.setMember(isMember);
        customer.setMemberType(type);
    }

    @Override
    public String toString() {
        return "Visit[customer=" + customer + ", date=" + date +
                ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + "]";
    }
}
