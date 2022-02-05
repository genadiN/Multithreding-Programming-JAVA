package Coffee;

public class CoffeeConsumer {
    public static void main(String[] args) {
        CoffeeServiceProviders providers = new CoffeeServiceProviders();

        CoffeeMachineService lavazzaProvider = providers.makeLavazza();
        CoffeeMachineService spetemaProvider = providers.makeSpetema();
        CoffeeDrinker drinker = new CoffeeDrinker(lavazzaProvider);

        drinker.drinkCoffee(1.00); // Drink lavazza for 1lev
        drinker.setCallback(spetemaProvider);
        drinker.drinkCoffee(1.00); // Drink spetema for 1lev

        drinker.drinkCoffee(1.00, lavazzaProvider); // Drink Lavazza for 1lv
    }
}
