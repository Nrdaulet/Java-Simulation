import java.util.*;

public class PathFinder{
    public boolean pathFinder(Coordinates c1, Coordinates c2, World world){

        Queue<Coordinates> queue = new ArrayDeque<>();
        Set<Coordinates> visited = new HashSet<>();

        Map<Coordinates, Coordinates> path;

        queue.offer(c1); // Кладем стартовую координаты в очередь и в посещенные
        visited.add(c1);

        int[][] fourDir = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0,-1}};



        while(!queue.isEmpty()){
            Coordinates current = queue.poll();
            for(int[] direction : fourDir){
                Coordinates next = new Coordinates(
                        current.col()+direction[0],
                        current.row()+direction[1]
                );
                if(!visited.contains(next) && world.isInBounds(next)){
                    if(next.equals(c2)) return true;
                    visited.add(next);
                    if(world.isEmpty(next))queue.offer(next);

                }

            }
        }


        return false;

    }
}
