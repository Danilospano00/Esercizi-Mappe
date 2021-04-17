package org.corso.mappe;

public class Macchina {
    private String modello;
    private int anno;
    private Motore motore;

    public Macchina() {
        }
    public Macchina(String modello, int anno) {
        this.modello = modello;
        this.anno = anno;
    }
    
    public Macchina(String modello, int anno, Motore motore) {
        this.modello = modello;
        this.anno = anno;
        this.motore = motore;
    }
    public String getModello() {
        return modello;
    }
   
    public void setModello(String modello) {
        this.modello = modello;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Motore getMotore() {
        return motore;
    }
    public void setMotore(Motore motore) {
        this.motore = motore;
    }

    

    
}
