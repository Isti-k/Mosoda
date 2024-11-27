package hu.szamalk;

public class Ruha {
    private String tulaj;
    private boolean tiszta;


    public Ruha(String tulaj) {
        this.tulaj = tulaj;
        this.tiszta = false;
    }

    public String getTulaj() {
        return tulaj;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    public boolean isTiszta() {
        return tiszta = true;
    }
}
