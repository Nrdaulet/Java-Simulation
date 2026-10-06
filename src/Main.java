public class Main{
    public static void main(String[] args){
        World world = new World(5, 5);
        Entity entity1 = new Herbivore("🐇", 5, 20);
        Entity entity2 = new Herbivore("🐇", 5, 20);
        Coordinates coordinates1 = new Coordinates(2,4);
        Coordinates coordinates2 = new Coordinates(1,3);
        Coordinates coordinates3 = new Coordinates(2,3);
        world.setEntity(coordinates1, entity1);
        world.setEntity(coordinates2, entity2);
        world.moveEntity(coordinates2, coordinates3);
        world.moveEntity(coordinates1, coordinates3);

    }
}