interface Monster{
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal{
    void kill();
}

class DragonZilla implements DangerousMonster{
    public void menace(){}
    public void destroy(){}
}

interface Vampire extends DangerousMonster, Lethal{
    void drinkBlood();
}


public class HorrorShow {
    static void feed(Monster b){ b.menace();}
    static void runAway(DangerousMonster danger){
        danger.menace();
        danger.destroy();
    }

    public static void main(String[] args) {
        DragonZilla babyZilla = new DragonZilla();
        feed(babyZilla);
        runAway(babyZilla);
    }
}
