import java.lang.classfile.attribute.StackMapTableAttribute;

public class Grass extends Entity {
    private static final int NUTRITION = 5;

    public Grass(){
        super("\uD83C\uDF31");
    }
    public Grass(String icon) {
        super(icon);

    }
}
