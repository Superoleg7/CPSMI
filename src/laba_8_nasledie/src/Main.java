public class Main {
    public static void main(String[] args) {
        Photoable landscape = new Camera();
        landscape.PhotoLandscape();
        Listenable music = new Walkman();
        music.ListenMusic();
        Photoable landscape1 = new MobilePhone();
        landscape1.PhotoLandscape();
        Listenable music1 = new MobilePhone();
        music1.ListenMusic();
    }
}

