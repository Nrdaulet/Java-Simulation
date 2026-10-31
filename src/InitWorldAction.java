public class InitWorldAction implements Action{


    public void execute(World world){
        Coordinates coordinates = new Coordinates(4,0);

        world.setEntity(coordinates, new Herbivore(4,10));
        world.setEntity(new Coordinates(0,9), new Herbivore(2,10));
        world.setEntity(new Coordinates(9,1), new Grass());
        world.setEntity(new Coordinates(0,0), new Predator(3,10));
//        world.setEntity(new Coordinates(9,9), new Grass());


    }
}
