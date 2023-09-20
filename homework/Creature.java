package homework;

public class Creature extends Being {

    int health;
    int attack;
    int defense;

    String[] memory;
    int memoryOffset;

    public Creature() {
        memory = new String[15];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        if(creature!=this){
            System.out.println("I tell " + creature + "'" + something + "'");
            creature.listen(something);
        }
        else{
            System.out.println("I say:"+something);
        }
        
    }

    public void listen(String something) {
        System.out.println("I heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap) {
        System.out.println("I attack " + creature + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                System.out.println("I got " + ap + "points attack");
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println("I am dead");
            return true;
        }

        return false;
    }

    public void rolleyes() {
        System.out.println("I roll my eyes.");
    }

    public void blink(){
        System.out.println("I am blinking.");
    }

    public void move() {
        System.out.println("I walk a distance.");
    }

    public void sniff(Being obj){
        if(obj!=null)
            System.out.println("I sniff "+obj);
        else
            System.out.println("I sniff.");
    }

    public void LeverageObject(Being obj,String s){
        System.out.println("I "+s+" "+obj);
    }

    public void smile(){
        System.out.println("I smile.");
    }

    public void laughAtSomeone(Creature creature){
        System.out.println("I laugh at "+creature);
    }

    public void touchHead(){
        System.out.println("I touch my head.");
    }

    public void jump(){
        System.out.println("I'm jumping.");
    }

    public void beShocked(){
        System.out.println("I am very shocked.");
    }
}
