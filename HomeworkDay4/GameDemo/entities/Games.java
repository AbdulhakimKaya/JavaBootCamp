package HomeworkDay4.GameDemo.entities;

public class Games {
    private int id;
    private String gameName;
    private int unitPrice;

    public Games(int id, String gameName, int unitPrice) {
    }

    public Games() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
