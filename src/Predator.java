public class Predator extends Creature{
    private int damage;

    public Predator(String icon, int speed, int health, int damage) {
        super(icon, speed, health);
        this.damage = damage;
    }

    @Override
    public void makeMove() {
    }
    public void attack(){

    }
}
