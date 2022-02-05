package CanFight;

public class Adventure {
    static void makeTrouble(CanFight x){ x.fight(); }
    static void breakRecord(CanSwim x){ x.swim(); }
    static void tryFaster(CanFly x){ x.fly(); }
    static void makeMovie(ActionCharacter x){ x.fight(); }

    public static void main(String[] args){
        Hero hero = new Hero();
        //Hero is an AdventureCharacter
        //he also CanFight, CanSwim, CanFly
        makeTrouble(hero); //Treat hero as a CanFight

        breakRecord(hero); // Treat hero as a CanSwim

        tryFaster(hero); // Treat hero as a CanFly

        makeMovie(hero); // Treat hero as an ActionCharacter
    }
}
