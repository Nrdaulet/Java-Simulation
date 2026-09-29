import java.util.HashMap;

public class Arena {
    private final int width = 8;
    private final int heigth = 8;

    HashMap<Coordinates, Entity> map = new HashMap<>();

    public void setEntity(Coordinates coordinates, Entity entity){
        entity.coordinates = coordinates;
        map.put(coordinates, entity);
    }

    public void setDefaultPosition(){

    }

    public int getWidth(){
        return width;
    }

    public int getHeigth(){
        return heigth;
    }

    public boolean isEmpty(Coordinates coordinates){
        return !map.containsKey(coordinates);
    }

    public Entity getEntity(Coordinates coordinates){
        return map.get(coordinates);
    }

    public void getContribution(){

    }
}
