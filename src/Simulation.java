import java.util.List;

public class Simulation {
    World world = new World(10,10);

    private int turnCounter;
    private final List<Action> initActions;
    private final List<Action> turnActions;
    Renderer renderer = new Renderer();


    public Simulation(List<Action> initActions, List<Action> turnActions){
        this.initActions = initActions;
        this.turnActions = turnActions;
    }


    public void nextTurn(){
        turnCounter++;
        renderer.render(world);

    }

    public void startSimulation(){

    }

    public void pauseSimulation(){
        if (world.isEmpty(new Coordinates(4,2))){
            System.out.println("Do nothing");
        }
    }
    
}
