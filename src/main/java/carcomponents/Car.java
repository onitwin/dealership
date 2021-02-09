package carcomponents;


import behaviours.IBuy;
import behaviours.IValue;

public class Car implements IValue {

    private String model;
    private int price;
    private Engine engine;
    private Tyre tyre;
    private int damage;

    public Car (String model, int price, Engine engine, Tyre tyre){
        this.model = model;
        this.price = price;
        this.engine = engine;
        this.tyre = tyre;
        this.damage = 0;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }


    public int getDamage() {
        return damage;
    }

    public void addDamage(int damage) {
        this.damage = damage;
        this.price -= damage;
    }

    public void repairDamage(int repairValue) {
        if (damage > 0) {
            this.damage -= repairValue;
            this.price +=repairValue;
        }
    }

    public int value(){
        return this.price;

    }


}
