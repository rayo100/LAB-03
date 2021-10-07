package dominio;

import java.awt.Color;
/**
 * Write a description of class Rebelde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rebelde extends Pirata
{
    // instance variables - replace the example below with your own
    private Isla isla;   
    
    int cont = 0;
    /**
     * Constructor for objects of class Rebelde
     */
    public Rebelde(Isla isla,String name,int posicionx, int posiciony)
    {
        super(isla,name,posicionx,posiciony);
        this.isla=isla;
        color=Color.RED;
        super.palabras="Soy rebelde";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void actue(){
        cont += 1;
        if(cont % 3 == 0){
            super.actue();
        }
    }
    public void pare(){
        super.actue();
    }
    public void decida(){
        super.pare();
    }
}
