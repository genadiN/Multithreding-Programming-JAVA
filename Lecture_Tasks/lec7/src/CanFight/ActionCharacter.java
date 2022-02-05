package CanFight;

public class ActionCharacter {
    public void fight(){}
}

class Hero extends ActionCharacter
        implements CanFight, CanFly, CanSwim{
    public void swim(){}
    public void fly(){}
}


