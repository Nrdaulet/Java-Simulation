public class Main{
    public static void main(String[] args){
        World world = new World(10, 10);






        Renderer renderer = new Renderer();
        InitWorldAction initWorldAction = new InitWorldAction();
        initWorldAction.execute(world);
        renderer.render(world);

    }
}