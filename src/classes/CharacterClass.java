package classes;

public class CharacterClass implements BaseClass {
    private int healthPoints;
    private int manaPoints;
    private int level;
    private int atackAmount;
    private String name;
    private int maxHealthPointh;
    private int maxManaPoints;

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints < 0) this.healthPoints = 0;
        else if (healthPoints > this.maxHealthPointh) this.healthPoints = this.maxHealthPointh;
        else this.healthPoints = healthPoints;
    }

    public int getManaPOints() {
        return manaPoints;
    }

    public void setManaPOints(int manaPoints) {
        if (manaPoints < 0 ) this.manaPoints = 0;
        else if (manaPoints > this.maxManaPoints) this.manaPoints = this.maxManaPoints;
        else this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0) System.out.println("Уровень не может быть меньше 0");
        this.level = level;
    }

    public int getAtackAmount() {
        return atackAmount;
    }

    public void setAtackAmount(int atackAmount) {
        this.atackAmount = atackAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealthPointh() {
        return maxHealthPointh;
    }

    public void setMaxHealthPointh(int maxHealthPointh) {
        this.maxHealthPointh = maxHealthPointh;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    @Override
    public void atack() {

    }

    @Override
    public void restoreHealth(int amount) {
        setHealthPoints(this.healthPoints + amount);
    }

    @Override
    public void loseHealth(int amount) {
        setHealthPoints(this.healthPoints - amount);
    }

    @Override
    public void restoreMana(int amount) {
        setManaPOints(this.manaPoints + amount);
    }

    @Override
    public void loseMana(int amount) {
        setManaPOints(this.manaPoints - amount);
    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {

    }
}
