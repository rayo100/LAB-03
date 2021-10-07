package dominio;

import java.awt.Color;
/**
 * Write a description of class Quieto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perezoso extends Pirata
{
    // instance variables - replace the example below with your own
    private int x;
    private Isla isla;
    /**
     * Constructor for objects of class Quieto
     */
    public Perezoso(Isla isla,String name,int posicionx, int posiciony)
    {
        super(isla,name,posicionx,posiciony);
        this.isla=isla;
        color=Color.blue;
        super.palabras="Soy perezoso";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void actue(){
        if(getPosicionBrazo('D') == ABAJO && getPosicionBrazo('I') == ABAJO){
            muevaBrazo('I','S');
            muevaBrazo('D','S');
        }
        else{
            muevaBrazo('I','B');
            muevaBrazo('D','B');
        }
        muevaPierna('D','P');
        muevaPierna('I','P');
        palabras = "";
    }
    public void pare(){
        muevaPierna('D','S');
        muevaPierna('I','S');
        muevaPierna('D','S');
        muevaPierna('I','S');
        palabras = "¡Aqui Piratas Perezosos!";
    }
    public void decida(){
        corte();
    }
}
