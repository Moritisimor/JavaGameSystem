package JavaGameSystem.Items;

public class Weapon extends Item {
    private String type;
    private String enchantment;
    private Integer damage;
    private Boolean ranged;

    // GETTER SETTER REGION

    public void setType(String type) {
        this.type = type;
    }
    public void setEnchantment(String enchantment) {
        this.enchantment = enchantment;
    }
    public void setDamage(Integer damage) {
        this.damage = damage;
    }
    public void setRanged(Boolean ranged) {
        this.ranged = ranged;
    }

    public String getType() {
        return type;
    }

    public String getEnchantment() {
        return enchantment;
    }

    public Integer getDamage() {
        return damage;
    }

    public Boolean getRanged() {
        return ranged;
    }
}