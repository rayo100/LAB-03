package dominio;
import java.awt.Color;
public class Minucioso extends Pirata
{
    // instance variables - replace the example below with your own
    private Isla isla;   
    
    int cont = 0;
    /**
     * Constructor for objects of class Rebelde
     */
    public Minucioso(Isla isla,String name,int posicionx, int posiciony)
    {
        super(isla,name,posicionx,posiciony);
        this.isla=isla;
        color=Color.ORANGE;
        super.palabras="Soy minucioso";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void actue(){
        super.muevase('N');
    }
    public void pare(){
        super.actue();
    }
    public void decida(){
        super.pare();
    }
}