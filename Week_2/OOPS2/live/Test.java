package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // Part a
        Veena v = new Veena();
        v.play();

        // Part b
        Saxophone s = new Saxophone();
        s.play();

        // Part c
        Playable p;

        p = v;
        p.play();

        p = s;
        p.play();
    }
}
