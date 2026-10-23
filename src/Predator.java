public class Predator extends Creature{
    private final int damage = 2;

    public Predator(int speed, int health) {
        super("🐺", speed, health);
    }

    @Override
    public void makeMove(World world) {
        Coordinates current = getCoordinates();
        world.moveEntity(current, new Coordinates(7,9));

    }

}
