package nezet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Kert;
import modell.Noveny;


public class KertKonzol {
    
    private static File file = new File("kert.bin");
    
    public static void main(String[] args) {
        Kert kert = new Kert();
        szerializacio(kert);
        hozzaadasKertbol(kert);
        torlesKertbol(kert);
        deszerializacio(kert);
    }

    private static void szerializacio(Kert kert) {
        
        try {
            
            FileOutputStream fileOut = new FileOutputStream(file); 
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            
            objOut.writeObject(kert);
            
            objOut.close();
            fileOut.close();
            
            
        } catch (Exception e) {
            System.err.println(e);
        }
    
    
    }
    
        
private static void hozzaadasKertbol(Kert kert) {
    kert.hozzaadas(new Noveny(3000, 2, "asdasd", "asd"));
    kert.hozzaadas(new Noveny(3500, 1, "Rozsa", "rozs"));
}

    private static void torlesKertbol(Kert kert) {
        kert.setNovenyek(null);
    }

    private static void deszerializacio(Kert kert) {
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            
            kert = (Kert)objIn.readObject();
            
            objIn.close();
            fileIn.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
