public class Grass extends Entity implements Ediable{
    private static final int NUTRITION = 5;

    public Grass(String icon) {
        super(icon);

    }

    @Override
    public int getNutrition() {
        return NUTRITION;
    }
}
