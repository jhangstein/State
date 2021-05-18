package at.ac.fhcampuswien2;

public class Mensch {

    private Zustand zustand;

    public void getZustand() {
        System.out.println("Aktueller Zustand: " + zustand.getClass().getSimpleName());
        System.out.println();
    }

    public void setZustand(Zustand zustand){
        this.zustand = zustand;
    }

    public Mensch(){
        setZustand(new Neutral(this));
    }

    public void unterhalten(){
        zustand.unterhalten();
    }

    public void küssen(){
        zustand.küssen();
    }

    public void ärgern(){
        zustand.ärgern();
    }

    public static void main(String[] args) {
        Mensch mensch = new Mensch();

        mensch.getZustand();

        mensch.ärgern();

        System.out.println();

        mensch.getZustand();

        mensch.küssen();
        mensch.unterhalten();

        System.out.println();

        mensch.getZustand();

        mensch.küssen();

        System.out.println();

        mensch.getZustand();

        mensch.unterhalten();
        mensch.ärgern();

        mensch.getZustand();

        mensch.ärgern();
    }
}
