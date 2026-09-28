import java.util.Objects;

public class Coordinates {

    public int row;
    public int col;


    public Coordinates(int col, int row){
        this.col = col;
        this.row = row;
    }

    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Objects.equals(col, that.col) &&Objects.equals(row, that.row);
    }

    @Override
    public int hashCode(){
        return Objects.hash(col, row);
    }
}
