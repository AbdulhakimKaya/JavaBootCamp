package oopIntro;

public class Product {
    //encapsulation
    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;


    public Product() {

    }

    public Product(int id, java.lang.String name, double unitPrice, java.lang.String detail,double discount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public java.lang.String getDetail() {
        return detail;
    }

    public void setDetail(java.lang.String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice - (this.unitPrice * discount / 100);
    }


}
