import java.util.*;

public class PathFinder{
    public List<Coordinates> find(Coordinates start, Class<? extends Entity> targetType, World world){

        Queue<Coordinates> queue = new ArrayDeque<>();
        Set<Coordinates> visited = new HashSet<>();

        Map<Coordinates, Coordinates> cameFrom = new HashMap<>();

        queue.offer(start); // Кладем стартовую координаты в очередь и в посещенные
        visited.add(start);

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
                if(world.isInBounds(next) &&!visited.contains(next)){
                    if(targetType.isInstance(world.getEntity(next))){
                        cameFrom.put(next, current);

                        List<Coordinates> path = new ArrayList<>(); // out path
                        Coordinates step = next; // there i
                        while (!step.equals(start)){
                            path.add(step);
                            step = cameFrom.get(step);
                        }
                        Collections.reverse(path);
                        return path;

                    }
                    visited.add(next);
                    if(world.isEmpty(next)){
                        queue.offer(next);
                        cameFrom.put(next, current);
                    }

                }

            }
        }


        return null;

    }
}
