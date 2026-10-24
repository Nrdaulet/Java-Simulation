import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class PathFinder {
    public boolean pathFinder(Entity e1, Entity e2){
        Coordinates c1 = e1.getCoordinates();
        Coordinates c2 = e2.getCoordinates();

        Queue<Coordinates> queue = new ArrayDeque<>();



        Set<Coordinates> visited = new HashSet<>();

        queue.offer(c1); // Кладем стартовую координаты в очередь и в посещенные
        visited.add(c1);

        int[][] fourDir = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0,-1}};

        Coordinates current = queue.poll();

        while(!queue.isEmpty()){
            for(int[] direction : fourDir){
                Coordinates next = new Coordinates(
                        current.col()+direction[0],
                        current.row()+direction[1]
                );
            }
        }


        return true;

    }
}
