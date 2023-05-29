package modell;

import java.io.Serializable;

public class Noveny implements Serializable{
    private int ar, kor;
    private final String nev;
    private String azonosito;

    public Noveny(int ar, int kor, String nev, String azonosito) {
        this.ar = ar;
        this.kor = kor;
        this.nev = nev;
        this.azonosito = azonosito;
    }

    public int getAr() {
        return ar;
    }

    public int getKor() {
        return kor;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    @Override
    public String toString() {
        return "Noveny{" + "ar=" + ar + ", kor=" + kor + ", nev=" + nev + ", azonosito=" + azonosito + '}';
    }

    
}
