
import java.util.Scanner;
class Inheritance_Creature {
    protected  String name;
    protected int health;

    public Inheritance_Creature(String name, int health){
        this.name=name;
        this.health=health;
    }

    public void describe(){
        System.out.println("I am"+name+"with"+health+"health");
    }
}

class Dragon extends Inheritance_Creature{
    private  int firePower;
    
    public Dragon (String name, int health, int firePower)
    {
        super(name,health);
            this.firePower= firePower;
    }

    @Override
    public void describe(){
        System.out.println("I am " + name + ", an Dragon with " + health + " health and " + firePower + "fire power.");
    }
}
class Elf extends Inheritance_Creature{
    private int  agility;

    public Elf (String name, int health, int agility)
    {
        super(name, health);
        this.agility=agility;
    }
    @Override
    public void describe(){
        System.out.println("I am " + name + ", an Elf with " + health + " health and agility" + agility + ".");
    }
}

public class Main{
    public static void main(String[] args) {
        Inheritance_Creature c1 = new Dragon("Atanu", 300, 50);
        Inheritance_Creature c2 = new Elf("Drake", 300, 30);

        c1.describe();
        c2.describe();
        
    }
}


