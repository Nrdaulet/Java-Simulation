public abstract class Creature extends Entity{
    private int speed;


    public Creature(String icon, int speed) {
        this.speed = speed;
        super(icon);
    }



    public abstract void makeMove(World world);
}
