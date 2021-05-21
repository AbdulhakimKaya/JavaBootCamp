package HomeworkDay4.GameDemo.entities;

public class Campaign extends Games {
    private int id;
    private String name;
    private int discount;
    private double unitPriceAfterDiscount;

    public Campaign() {
    }

    public Campaign(int id, String name, int discount, int unitPriceAfterDiscount) {
        this.setId(id);
        this.setName(name);
        this.setDiscount(discount);
        this.setUnitPriceAfterDiscount(unitPriceAfterDiscount);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public double getUnitPriceAfterDiscount(int unitPrice) {
        return unitPrice - (this.getDiscount()*unitPrice/100);
    }
    public void setUnitPriceAfterDiscount(double unitPriceAfterDiscount) {
        this.unitPriceAfterDiscount = unitPriceAfterDiscount;
    }
}
