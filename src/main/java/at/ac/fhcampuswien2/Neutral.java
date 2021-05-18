package at.ac.fhcampuswien2;

import java.util.Random;

public class Neutral implements Zustand{

    private Mensch mensch;

    public Neutral(Mensch mensch){
        this.mensch = mensch;
    }

    @Override
    public void unterhalten() {
        Random generator = new Random();
        int i = generator.nextInt(6) + 1;

        switch(i) {
            case 1:
                System.out.println("Ich glaube du spinnst!!!");
                mensch.setZustand(new Bockig(mensch));
                break;
            case 2: case 3: case 4:
                System.out.println("OK, ist in Ordnung!");
                break;
            case 5: case 6:
                System.out.println("Haha, ja das stimmt!");
                mensch.setZustand(new Fröhlich(mensch));
                break;
        }
    }

    @Override
    public void küssen() {
        System.out.println("Hihi :-)");
        mensch.setZustand(new Fröhlich(mensch));
    }

    @Override
    public void ärgern() {
        System.out.println("Geht's dir noch gut?!?!");
        mensch.setZustand(new Bockig(mensch));
    }
}
