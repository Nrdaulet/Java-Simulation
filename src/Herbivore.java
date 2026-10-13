public class Herbivore extends Creature{
    private int hp;


    public Herbivore(String icon, int speed, int health) {
        super("🐇", speed, health);
    }

    @Override
    public void makeMove() {

    }

    public int getHp() {
        return hp;
    }
    public void takeDamage(int damage){
        hp-=damage;
    }
}
