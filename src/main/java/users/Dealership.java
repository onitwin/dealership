package users;

import behaviours.IValue;
import carcomponents.Car;

import java.util.ArrayList;

public class Dealership  {

    private int funds;
    private ArrayList<IValue> stockOfCars;

    public Dealership(){
        this.funds=0;
        this.stockOfCars=new ArrayList<IValue>();
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public ArrayList<IValue> getStockOfCars() {
        return stockOfCars;
    }

    public void setStockOfCars(ArrayList<IValue> stockOfCars) {
        this.stockOfCars = stockOfCars;
    }

    public int getGarageSize(){
        return this.stockOfCars.size();
    }

    public void addCarToStock(Car car){
        this.stockOfCars.add(car);
    }


    public void removeCarFromStock(IValue car){
        int carindex=stockOfCars.indexOf(car);
        stockOfCars.remove(carindex);
    }
}
