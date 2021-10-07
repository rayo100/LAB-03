package dominio;
import java.awt.*;
public class Sol implements EnIsla{
    private Isla isla;
    private Color color;
    private String name;
    private int x;
    private int y;
    private boolean isVisible;
    public Sol(Isla isla, int PosicionX, int PosicionY){
        this.isla = isla;
        color = Color.WHITE;
        name = "";
        x = PosicionX;
        y = PosicionY;
    }
    public void actue(){
        color = Color.YELLOW;
    }
    public void pare(){
       color = Color.BLUE; 
    }
    
    public Color getColor(){
        return color;
    }
    public String forma(){
        return "Circulo";
    }
    public int getPosicionY(){
        return y;
    }
    public int getPosicionX(){
        return x;
    }
}
