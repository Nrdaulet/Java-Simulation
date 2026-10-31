public class Renderer {
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

    public void render2(World world){
        StringBuilder sb = new StringBuilder();
        sb.append('+');
        for (int i = 0; i < world.getWidth(); i++) sb.append('-');
        sb.append("+\n");

        for(int y = 0;y< world.getHeight();y++){
            sb.append("|");
            for (int x = 0; x < world.getWidth(); x++) {
                Coordinates coordinates = new Coordinates(x ,y);
                Entity entity = world.getEntity(coordinates);
                if(world.isEmpty(coordinates)){
                    sb.append("⬜ ");
                }else{
                    sb.append(entity.getIcon()).append(" ");
                }
            }
            sb.append("|\n");
        }

        sb.append('+');
        for (int i = 0; i < world.getWidth(); i++) sb.append('-');
        sb.append("+\n");

        System.out.println(sb.toString());

    }
}
