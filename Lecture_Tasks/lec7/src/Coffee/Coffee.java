package Coffee;

//1 Create interface for service mthod description
interface CoffeeMachineService{
    CoffeeCup prepareCoffee(double price);
}
class CoffeeCup{
}

//Create a class where inner classes describe service implementions
class CoffeeServiceProviders{
    //Note all inner classes implement the service description interface
    private class LavatzaProvider implements CoffeeMachineService{
        public CoffeeCup prepareCoffee(double price){
            System.out.println("Lavazza coffee served.");
            return new CoffeeCup();
        }
    }
    // Note a method in the outer class creates an object of the inner class
    public CoffeeMachineService makeLavazza(){
        return new LavatzaProvider();
    }
    private class SpetemaProvider implements CoffeeMachineService{
        public CoffeeCup prepareCoffee(double price){
            System.out.println("Spetema coffee served");
            return new CoffeeCup();
        }
    }
    public CoffeeMachineService makeSpetema(){
        return new SpetemaProvider();
    }
}

public class Coffee {
}
