package users;

import behaviours.IBuy;
import behaviours.IValue;
import carcomponents.Car;

import java.util.ArrayList;

public class Customer   {

    private int funds;
    private ArrayList<IValue> garage;

    public Customer(int funds){
        this.funds = funds;
        this.garage = new ArrayList<IValue>();

    }

    public int getFunds() {
        return funds;
    }

    public ArrayList<IValue> getGarage() {
        return garage;
    }

    public int getGarageSize(){
        return this.garage.size();
    }

    public void addCar(IValue item){
        this.garage.add(item);
    }

    public void buy(IValue item){
        this.funds -= item.value();
        this.garage.add(item);
    }

    public void removeCarFromGarage(IValue car){
        int carindex=garage.indexOf(car);
        garage.remove(carindex);
    }
}
