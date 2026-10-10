public class Main{
    public static void main(String[] args){
        World world = new World(5, 5);
        Entity entity1 = new Herbivore("🐇", 5, 20);
        Entity entity2 = new Herbivore("🐇", 5, 20);

        Entity entity3 = new Predator("🐺",20,30,20);
        Entity grass = new Grass();
        Entity tree = new Tree();
        Entity rock = new Rock();


        Coordinates coordinates1 = new Coordinates(2,4);
        Coordinates coordinates2 = new Coordinates(1,3);
        Coordinates coordinates3 = new Coordinates(2,3);
        Coordinates coordinates4 = new Coordinates(1,1);
        Coordinates coordinates5 = new Coordinates(0, 0);
        Coordinates coordinates6 = new Coordinates(2,1);
        Coordinates coordinates7 = new Coordinates(4,4);
        world.setEntity(coordinates1, entity1);
        world.setEntity(coordinates2, entity2);
        world.setEntity(coordinates4,entity3);
        world.setEntity(coordinates5,tree);
        world.setEntity(coordinates6,grass);
        world.setEntity(coordinates7,rock);


        world.moveEntity(coordinates2, coordinates3);
        world.moveEntity(coordinates1, coordinates3);

        Simulation simulation = new Simulation();
        simulation.render(world);

    }
}