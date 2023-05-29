package modell;

import java.io.Serializable;
import java.util.ArrayList;

public class Kert implements Serializable{
    
    private ArrayList<Noveny> novenyek;
    
    public Kert(){
    this.novenyek = new ArrayList<>();
    
    this.novenyek.add(new Noveny(1200,2,"Narcisz", "narci"));
    this.novenyek.add(new Noveny(2000,3,"Palma", "pall"));
    this.novenyek.add(new Noveny(3000,1,"Orgona", "orgl"));
}
    
    public void torol(Noveny noveny){
        this.novenyek.remove(noveny);
    }
    
    public void hozzaadas(Noveny noveny){
        this.novenyek.add(noveny);
    }
    
    public Kert(ArrayList<Noveny> novenyek){
        this.novenyek=novenyek;
    }
    
    public ArrayList<Noveny> getNovenyek(){
        return novenyek;
    }
    
    public void setNovenyek(ArrayList<Noveny> novenyek){
        this.novenyek = novenyek;
    }
    
}
