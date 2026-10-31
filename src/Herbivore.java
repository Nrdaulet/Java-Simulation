import java.util.ArrayList;
import java.util.List;

public class Herbivore extends Creature{
    private int hp;
    PathFinder pathFinder = new PathFinder();

    public Herbivore(int speed, int hp) {
        super("🐇", 2);
        this.hp = hp;
    }

    @Override
    public void makeMove(World world) {
        List<Coordinates> path = pathFinder.find(getCoordinates(), Grass.class, world);
        System.out.println(path);

        if(path.size() <= getSpeed()){
            world.removeEntity(path.getLast());
            return;
        }
        int steps = Math.min(getSpeed(), path.size() - 1);
        for(int i = 0;i<steps;i++){
            world.moveEntity(getCoordinates(), path.get(i));


        }



    }

    public int getHp(){
        return hp;
    }


    public void takeDamage(int damage){
        this.hp-=damage;
    }
}
