public class Main{
    public static void main(String[] args){
        World world = new World(5, 5);






        Renderer renderer = new Renderer();
        InitWorldAction initWorldAction = new InitWorldAction();
        initWorldAction.execute(world);
        renderer.render(world);

    }
}