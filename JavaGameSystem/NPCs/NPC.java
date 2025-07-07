package JavaGameSystem.NPCs;

public class NPC {
    private String npcname;
    private Integer npchealth;
    private Integer npcdamage;
    private Boolean hostile;
    private Boolean interactive;
    private Boolean unique;

    public String getNpcname() {
        return npcname;
    }
    public Integer getNpchealth() {
        return npchealth;
    }
    public Integer getNpcdamage() {
        return npcdamage;
    }
    public Boolean getHostile() {
        return hostile;
    }
    public Boolean getInteractive() {
        return interactive;
    }
    public Boolean getUnique() {
        return unique;
    }

    public void setNpcname(String npcname) {
        this.npcname = npcname;
    }

    public void setNpchealth(Integer npchealth) {
        this.npchealth = npchealth;
    }

    public void setNpcdamage(Integer npcdamage) {
        this.npcdamage = npcdamage;
    }

    public void setHostile(Boolean hostile) {
        this.hostile = hostile;
    }

    public void setInteractive(Boolean interactive) {
        this.interactive = interactive;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public void move(String location) {
        System.out.println(npcname + " moves to " + location);
    }

    public void attackbehaviour() {
        if (hostile) {
            System.out.println(npcname + " attacks!");
        } else {
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