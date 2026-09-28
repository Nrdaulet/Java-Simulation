public abstract class Creature extends Entity{
    private int speed;
    private int health;

    public Creature(String icon, int speed, int health) {
        this.speed = speed;
        super(icon);
        this.health = health;
    }

    public abstract void makeMove();
}
