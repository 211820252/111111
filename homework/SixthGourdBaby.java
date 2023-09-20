package homework;

public class SixthGourdBaby extends Human{
    boolean whetherVisible;
    
    public SixthGourdBaby() {
        whetherVisible=true;
    }

    @Override
    public void useSkill() {
        System.out.println("I'm invisible!");
        this.whetherVisible=false;
    }

    @Override
    public void cancleSkill(){
        System.out.println("I'm visible now!");
        this.whetherVisible=true;
    }
}
