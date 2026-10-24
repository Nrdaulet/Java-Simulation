public class Herbivore extends Creature{
    private int hp;

    public Herbivore(int speed, int hp) {
        super("🐇", speed);
        this.hp = hp;
    }

    @Override
    public void makeMove(World world) {
        Coordinates current = getCoordinates();
        world.moveEntity(current, new Coordinates(current.col()+1,current.row()+1));
    }

    public int getHp(){
        return hp;
    }


    public void takeDamage(int damage){
        this.hp-=damage;
    }
}
