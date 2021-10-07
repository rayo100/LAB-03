package dominio;
import java.util.*;

public class Isla{
    public static final int MAXIMO = 500;
    private static Isla isla = null;
    Pirata jack;
    Pirata elizabeth;
    Rebelde henry;
    Rebelde corina;
    Minucioso ada;
    Minucioso turing;
    Perezoso natalia;
    Perezoso ronaldo;
    Palmera superiorDerecha;
    Palmera superiorIzquierda;
    Palmera inferiorDerecha;
    Palmera inferiorIzquierda;
    Sol sol;
    Sol sol1;
    public static Isla demeIsla() {
        if (isla==null){
            isla=new Isla();
        }
        return isla;
    }

    private static void nuevaIsla() {
        isla=new Isla();
    }   

    public static void cambieIsla(Isla d) {
        isla=d;
    }       

    private ArrayList<EnIsla> elementos;
    private int tesoroPosX;
    private int tesoroPosY;
    private boolean encontraronTesoro;

    private Isla() {
        elementos= new ArrayList<EnIsla>();
        tesoroPosX = (int)(Math.random() * MAXIMO);
        tesoroPosY = (int)(Math.random() * MAXIMO);
        encontraronTesoro=false;
    }

    public void algunosEnIsla(){
        jack = new Pirata(this, "Jack",100, 100);
        elizabeth = new Pirata(this, "Elizabeth", 150,100);
        henry = new Rebelde(this,"Henry",200,200);
        corina = new Rebelde(this,"Corina",250,200);
        ada = new Minucioso(this, "Ada",300,300);
        turing = new Minucioso(this,"Turing",350,300);
        natalia = new Perezoso(this,"Natalia",400,400);
        ronaldo = new Perezoso(this,"Ronaldo",450,400);
        superiorDerecha = new Palmera(this,450,50);
        superiorIzquierda = new Palmera(this,50,50);
        inferiorDerecha = new Palmera(this,450,450);
        inferiorIzquierda = new Palmera(this,50,450);
        sol = new Sol(this,220, 450);
        sol1 = new Sol(this,240,450);
        //adicione(sol);
        //adicione(sol1);
        adicione(jack);
        adicione(elizabeth);
        adicione(henry);
        adicione(corina);
        adicione(ada);
        adicione(turing);
        adicione(natalia);
        adicione(ronaldo);
        adicione(superiorDerecha);
        adicione(superiorIzquierda);
        adicione(inferiorDerecha);
        adicione(inferiorIzquierda);
    }  

    public EnIsla demeEnIsla(int n){
        EnIsla h=null;
        if (1<=n && n<=elementos.size()){
            h=elementos.get(n-1);
        }    
        return h; 
    }

    
    public void adicione(EnIsla e){
        elementos.add(e);
    }

    public int numeroEnIsla(){
        return elementos.size();
    }

    public boolean enTesoro(EnIsla e){
        boolean tesoro=(tesoroPosX==e.getPosicionX() && tesoroPosY==e.getPosicionY());
        encontraronTesoro = encontraronTesoro || tesoro;
        return tesoro;
    }     
    
    public void actuen(){
        for(EnIsla i: elementos){
            i.actue();
        }
    }

    public void paren(){
        for(EnIsla i: elementos){
            i.pare();
        }
    }    

    public void decidan(){
        for(EnIsla i: elementos){
            i.decida();
        }
    }  
}
