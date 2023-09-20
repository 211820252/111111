package homework;

public class Gate extends Being{
    boolean whetherOpen;

    public Gate(){
        whetherOpen=false;
    }

    public void open(){
        this.whetherOpen=true;
        System.out.println("The gate is open.");
    }
    
    public void close(){
        this.whetherOpen=false;
        System.out.println("The gate is close.");
    }
}
