package dominio;
import java.awt.*;
public class Palmera implements EnIsla{
    private Isla isla;
    private Color color;
    private String name;
    private int x;
    private int y;
    private boolean isVisible;
    public Palmera(Isla isla, int PosicionX, int PosicionY){
        this.isla = isla;
        color = Color.WHITE;
        name = "";
        x = PosicionX;
        y = PosicionY;
    }
    public void actue(){
        color = new Color(0,100,0);
    }
    public void pare(){
       color = new Color(50,205,50); 
    }
    public void decida(){
        actue();
        pare();
    }
    public Color getColor(){
        return color;
    }
    public String forma(){
        return "Cuadrado";
    }
    public int getPosicionY(){
        return y;
    }
    public int getPosicionX(){
        return x;
    }
}
