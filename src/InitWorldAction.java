public class InitWorldAction implements Action{


    public void execute(World world){
        Entity herbivore = new Herbivore(1,1);
        Entity predator = new Predator(4,4);
        Coordinates c1 = new Coordinates(0,0);
        Coordinates c2 = new Coordinates(9,9);
        Rock rock1 = new Rock();
        Rock rock2 = new Rock();
        Rock rock3 = new Rock();

        Coordinates c3 = new Coordinates(0,1);
        Coordinates c4 = new Coordinates(1,1);
        Coordinates c5 = new Coordinates(1,0);
        world.setEntity(c3, rock1);
        world.setEntity(c4, rock2);
//        world.setEntity(c5, rock3);
        world.setEntity(c1, predator);
        world.setEntity(c2, herbivore);
        world.setEntity(new Coordinates(2, 8), new Herbivore(2,6));
        world.setEntity(new Coordinates(1,4), new Predator( 4,8));
        world.setEntity(new Coordinates(0,2), new Rock());
        world.setEntity(new Coordinates(3,2), new Tree());
        world.setEntity(new Coordinates(2,2), new Grass());
        world.moveEntity(new Coordinates(1, 4), new Coordinates(7,6));
        PathFinder pathFinder = new PathFinder();
        boolean ans = pathFinder.pathFinder(c1, c2, world);
        System.out.println();
        System.out.println();
        System.out.println(ans);

    }
}
