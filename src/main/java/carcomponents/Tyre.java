package carcomponents;

import behaviours.IValue;

public class Tyre  implements IValue {
    private String brand;
    private int price;


    public Tyre(String brand,int price){
        this.brand=brand;
        this.price= price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return price;
    }

    public void setCost(int price) {
        this.price = price;
    }

    public int value(){
        return this.price;
    }
}
