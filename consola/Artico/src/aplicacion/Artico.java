package dominio;
import java.util.*;

public class Artico{
    public static final int MAXIMO = 500;
    private static Artico polo = null;

    public static Artico demeArtico() {
        if (polo==null){
            polo=new Artico();
        }
        return polo;
    }

    private static void nuevoArtico() {
        polo=new Artico();
    }   

    public static void cambieArtico(Artico d) {
        polo=d;
    }       

    private ArrayList<EnArtico> elementos;
    private int poloNorteX;
    private int poloNorteY;
    private boolean enPoloNorte;

    private Artico() {
        elementos= new ArrayList<EnArtico>();
        poloNorteX = (int)(Math.random() * MAXIMO);
        poloNorteY = (int)(Math.random() * MAXIMO);
        enPoloNorte=false;
    }

    public void algunosEnArtico(){
<<<<<<< HEAD
        
=======
        Esquimal aaju = new Esquimal(this, "aaju", 300, 300);
        Esquimal alek = new Esquimal(this, "alek", 300, 100);
        adicione(aaju);
        adicione(alek);
>>>>>>> c1ee89e85b66761c0b65f559475202efab2d4596
    }  

    public EnArtico demeEnArtico(int n){
        EnArtico h=null;
        if (1<=n && n<=elementos.size()){
            h=elementos.get(n-1);
        }    
        return h; 
    }

    
    public void adicione(EnArtico e){
        elementos.add(e);
    }

    public int numeroEnArtico(){
        return elementos.size();
    }

    public boolean enPoloNorte(EnArtico e){
        boolean ok=(poloNorteX==e.getPosicionX() && poloNorteY==e.getPosicionY());
        enPoloNorte = enPoloNorte || ok;
        return enPoloNorte;
    }     
    
    public void accion(){
        for (EnArtico i: elementos){
            i.accion();
        }
    }

    public void improvisen(){
        for (EnArtico i: elementos){
            i.improvise();
        }
    }    

    public void corten(){
        for (EnArtico i: elementos){
            i.corte();
        }
    }  
}
