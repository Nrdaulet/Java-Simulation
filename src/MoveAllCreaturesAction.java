import java.util.ConcurrentModificationException;

public class MoveAllCreaturesAction implements Action{


    public void execute(World world){
        for(Entity c : world.map.values()){
            if(c instanceof Creature creature)
                try{
                    creature.makeMove(world);
                }catch(ConcurrentModificationException e){
                    System.out.println("Who are you?");
            }


        }
    }
}
