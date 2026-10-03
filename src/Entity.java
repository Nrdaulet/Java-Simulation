import java.util.Objects;

public abstract class Entity {
    private final String icon;
    private Coordinates coordinates;

    public Entity(String icon){
        this.icon=icon;
    }


    public Coordinates getCoordinates(){
        return coordinates;
    }

    protected void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
