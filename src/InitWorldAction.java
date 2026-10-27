public class InitWorldAction implements Action{


    public void execute(World world){
        Coordinates coordinates = new Coordinates(0,0);

        world.setEntity(coordinates, new Herbivore(4,10));
//        world.setEntity(new Coordinates(1,1), new Grass());
        PathFinder pathFinder = new PathFinder();
        System.out.println(pathFinder.find(coordinates,Grass.class,world));

        System.out.println();
        System.out.println();

    }
}
