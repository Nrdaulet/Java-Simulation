import java.util.HashMap;
import java.util.Map;

public class World {
    private final int width;
    private final int height;

    public World(int width, int height){
        this.width = width;
        this.height = height;
    }

    Map<Coordinates, Entity> map = new HashMap<>();

    public boolean setEntity(Coordinates coordinates, Entity entity){
        entity.setCoordinates(coordinates);
        if(!isEmpty(coordinates) || !isInBounds(coordinates)) return false;
        map.put(coordinates, entity);
        entity.setCoordinates(coordinates);
        return true;
    }



    public void removeEntity(Coordinates coordinates){
        Entity entity = getEntity(coordinates);
        entity.setCoordinates(null);
        map.remove(coordinates);


    }

    public void setDefaultPosition(){

    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public boolean isEmpty(Coordinates coordinates){
        return !map.containsKey(coordinates);
    }

    public Entity getEntity(Coordinates coordinates){
        return map.get(coordinates);
    }

    public boolean isInBounds(Coordinates c){
        return c.col() >= 0 && c.col()<=width
                && c.row() >= 0 && c.row() <= height;

    }
    public boolean moveEntity(Coordinates from, Coordinates to){
        Entity entity = getEntity(from);
        if(entity == null) return false;
        if(!isEmpty(to) || !isInBounds(to)) return false;

        map.remove(from);
        map.put(to, entity);
        entity.setCoordinates(to);
        return true;

    }
}
