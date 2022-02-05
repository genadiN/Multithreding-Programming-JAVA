package Coffee;

public class CoffeeDrinker {
    private CoffeeMachineService callback;
    //pus other data members
    public CoffeeDrinker (CoffeeMachineService callback){
        this.callback = callback;
    }

    public CoffeeMachineService getCallback(){
        return callback;
    }

    public void setCallback(CoffeeMachineService callback){
        this.callback = callback;
    }

    //Option 1 Use callback as data member
    public void drinkCoffee(double price){
        if(callback != null){
            CoffeeCup cup = callback.prepareCoffee(price);
        }
    }
    //Option 2 Pass callback as parameter
    public void drinkCoffee(double price, CoffeeMachineService callback){
        if(callback != null){
            CoffeeCup cup = callback.prepareCoffee(price);
        }
    }
}
