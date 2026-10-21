public class MoveAllCreaturesAction implements Action{


    public void execute(World world){
        for(Entity c : world.map.values()){
            if(c instanceof Creature creature)
                creature.makeMove(world);
        }
    }
}
