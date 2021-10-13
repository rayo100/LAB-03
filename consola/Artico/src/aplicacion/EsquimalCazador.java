package dominio;
import java.awt.Color;
/**
 * Write a description of class EsquimalPerdido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/**
 * Write a description of class EsquimalSordo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EsquimalPrincipiante extends Persona implements EnArtico
{
    private Artico artico;
    protected String palabras;

        
    public EsquimalCazador(Artico artico,String _name,int posicionx, int posiciony, Color _color)
    {
        super(_name,posicionx,posiciony,_color);
        this.artico=artico;
        palabras="Qué qué?";
    }
    
    public final String tipo()
    {
        return "Persona";
    }
    
    public void improvise()
    {
        this.corte();
        setColor(Color.GREEN);
    }
    
    public void corte(){
        int n = 0;
        while(n<50)
        {
            super.avance('E');
            n ++;
        }
        palabras="";
    }
    @Override
    public final void accion()
    {
        if (! artico.enPoloNorte(this))
        {
            actue();
        }    
    }

    public void actue(){
        muevaBrazo('I','S'); 
        muevaBrazo('D','S');
        muevaPierna('I','S');
        muevaPierna('D','B');
    }
}
