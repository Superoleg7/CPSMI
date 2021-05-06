public class Superhero {
    public static void main(String[] args) {
    Superhero IronMan = new IronMan("Железный человек");
    Superhero Batman = new Batman("Бэтмэн");
    Superhero Wolverine = new Wolverine("Росомаха");
    Superhero BlackWidow = new BlackWidow("Черная вдова");
    Superhero[] allSuperheroes = new Superhero[] {IronMan, Batman, Wolverine, BlackWidow};

    for (Superhero superhero : allSuperheroes) superhero.attack();
}

    public void attack() {
    }
}
