package homework;

public class Human extends Creature{
    public Human() {
        health = 100;
        attack = 20;
        defense = 1;
    }
    public void useSkill(){
        System.out.println("I'm using my skill!");
    }
    public void cancleSkill(){
        System.out.println("I cancle my skill!");
    }
}
