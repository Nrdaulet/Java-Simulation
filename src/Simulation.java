public class Simulation {

    public void render(World world){
        for(int y = 0;y<world.getHeight();y++){
            for(int x = 0;x<world.getWidth();x++){
                Coordinates coordinates = new Coordinates(x ,y);
                Entity entity = world.getEntity(coordinates);
                if(world.isEmpty(coordinates)){
                    System.out.print("⬜ ");
                }else{
                    System.out.print(entity.getIcon() + " ");
                }
            }
            System.out.println();
        }
    }
}
