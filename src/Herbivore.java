public class Herbivore extends Creature{
    private int hp;


    public Herbivore(int speed, int health) {
        super("🐇", speed, health);
    }

    @Override
    public void makeMove(World world) {
        Coordinates current = getCoordinates();
        world.moveEntity(current, new Coordinates(9,4));
    }

    public int getHp() {
        return hp;
    }
    public void takeDamage(int damage){
        hp-=damage;
    }
}
