package at.ac.fhcampuswien2;

import java.util.Random;

public class Bockig implements Zustand{

    private Mensch mensch;

    public Bockig(Mensch mensch){
        this.mensch = mensch;
    }


    @Override
    public void unterhalten() {
        Random generator = new Random();
        int i = generator.nextInt(6) + 1;

        switch(i) {
            case 1: case 2: case 3:
                System.out.println("[Unterhaltung] Ich hoffe das passiert nicht wieder!");
                mensch.setZustand(new Neutral(mensch));
                break;
            case 4: case 5: case 6:
                System.out.println("[Unterhaltung] Lass mich in Ruhe!!!");
                break;
        }
    }

    @Override
    public void küssen() {
        System.out.println("[Küssen] Komm mir nicht zu nahe, Permission Denied!");
    }

    @Override
    public void ärgern() {
        System.out.println("[Ärgern] Ich glaube du spinnst, pack deine Sachen und gehe!!!");
    }

}
