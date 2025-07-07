package JavaGameSystem.NPCs;

public class NPC {
    private String npcname;
    private Integer npchealth;
    private Integer npcdamage;
    private Boolean hostile;
    private Boolean interactive;
    private Boolean unique;

    public void move() {
        System.out.println(npcname + " moves.");
    }

    public void attackbehaviour() {
        if (hostile) {
            System.out.println(npcname + " attacks!");
        }
        else {
            System.out.println(npcname + " runs away!");
        }
    }

    public void ShowInfo() {
        System.out.println("Name: " + npcname);
        System.out.println("Health: " + npchealth);
        System.out.println("Damage: " + npcdamage);
        if (hostile) {
            System.out.println("Hostile");
        } else {
            System.out.println("Docile");
        }

        if (interactive) {
            System.out.println("Interactive");
        } else {
            System.out.println("Not Interactive");
        }
        
        if (unique) {
            System.out.println("Unique");
        } else {
            System.out.println("Not Unique");
        }
    }
}