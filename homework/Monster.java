package homework;

public class Monster extends Creature{
    int magic;

    public Monster(int hp, int ap, int dp, int mp) {
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    @Override
    public void attack(Creature c, int ap) {
        System.out.println("I attack " + c + " of " + ap + "points");
        c.receiveAttack(ap * magic);
    }

    public void bePissed() {
        System.out.println("I'm so freakin pissed. ");
    }

    public void sleep(){
        System.out.println("I yawn and decide to sleep.");
    }
}
