package at.ac.fhcampuswien2;

import java.util.Random;

public class Fröhlich implements Zustand{

    private Mensch mensch;

    public Fröhlich(Mensch mensch){
        this.mensch = mensch;
    }
    @Override
    public void unterhalten() {
        Random generator = new Random();
        int i = generator.nextInt(6) + 1;

        switch(i) {
            case 1: case 2:
                System.out.println("OK, wenn du das meinst!");
                mensch.setZustand(new Neutral(mensch));
                break;
            case 3: case 4: case 5: case 6:
                System.out.println("Oh, das war aber lieb! <3");
                break;
        }
    }

    @Override
    public void küssen() {
        System.out.println("Hoho :-D");
    }

    @Override
    public void ärgern() {
        System.out.println("Wie bitte?! Ist das dein Ernst?!");
        mensch.setZustand(new Neutral(mensch));
    }
}
