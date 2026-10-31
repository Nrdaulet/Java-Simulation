import java.util.List;

public class Predator extends Creature{
    private static final int damage = 2;
    PathFinder pathFinder = new PathFinder();

    public Predator(int speed, int health) {
        super("🐺", 3);
    }

    @Override
    public void makeMove(World world) {
        Coordinates current = getCoordinates();
        List<Coordinates> path = pathFinder.find(getCoordinates(),Herbivore.class, world);

        if(path.isEmpty()) return;

        int steps = Math.min(getSpeed(), path.size()-1);

        for(int i = 0;i<steps;i++){
            world.moveEntity(getCoordinates(), path.get(i));
        }
        if(path.size()<=getSpeed()){
            world.removeEntity(path.getLast());
            world.moveEntity(getCoordinates(), path.getLast());
        }


    }

}
