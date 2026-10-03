public class Herbivore extends Creature implements Ediable{
    private static final int NUTRITION = 10;
    public Herbivore(String icon, int speed, int health) {
        super("🐇", speed, health);
    }

    @Override
    public void makeMove() {

    }


    @Override
    public int getNutrition() {
        return NUTRITION;
    }
}
