import java.util.List;

public class MoveAllCreaturesAction implements Action{


    public void execute(World world){
        List<Entity> entities = world.getAllEntities();
        for(Entity entity : entities) {
            if(entity instanceof Creature creature && world.getEntity(creature.getCoordinates()) == creature){
                creature.makeMove(world);
            }
            }


        }
}
