public class People extends Superhero{
    protected String name;

    public String getName() {
        return name;
    }

    public People (String name) {
        this.name = name;
    }

    public void attack() {
        {
            System.out.println(name+ "супергерой");
        }
    }
}

