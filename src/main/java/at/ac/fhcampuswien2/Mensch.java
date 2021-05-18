package at.ac.fhcampuswien2;

public class Mensch {

    private Zustand zustand;

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
        Mensch Goran = new Mensch();
        Goran.unterhalten();

    }
}
