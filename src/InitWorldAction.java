public class InitWorldAction implements Action{


    public void execute(World world){
        world.setEntity(new Coordinates(2, 4), new Herbivore(2,6));
        world.setEntity(new Coordinates(1,4), new Predator( 4,8));
        world.setEntity(new Coordinates(0,2), new Rock());
        world.setEntity(new Coordinates(3,2), new Tree());
        world.setEntity(new Coordinates(2,2), new Grass());

    }
}
