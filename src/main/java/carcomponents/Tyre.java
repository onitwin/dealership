package carcomponents;

public class Tyre {
    private String brand;
    private int cost;


    public Tyre(String brand,int cost){
        this.brand=brand;
        this.cost=cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
