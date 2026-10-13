import java.util.List;

public class Simulation {
    World world = new World(5,5);

    private final List<Action> initActions;
    private final List<Action> turnActions;
    Renderer renderer = new Renderer();


    public Simulation(List<Action> initActions, List<Action> turnActions) {
        this.initActions = initActions;
        this.turnActions = turnActions;
    }
}
