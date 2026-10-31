public class Main{
    public static void main(String[] args){
        World world = new World(10, 10);






        Renderer renderer = new Renderer();
        InitWorldAction initWorldAction = new InitWorldAction();
        initWorldAction.execute(world);
        renderer.render(world);

        System.out.println("--------------------");

        MoveAllCreaturesAction m = new MoveAllCreaturesAction();
        m.execute(world);
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);

        m.execute(world);
        System.out.println("--------------------");
        renderer.render(world);
    }
}