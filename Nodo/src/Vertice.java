import java.awt.*;

public class Vertice {
    private int x,y;
    public static final int diametro=60;

    public Vertice(int y, int x) {
        this.y = y;
        this.x = x;
    }
    public void pintar(Graphics g){
        g.drawOval(x-diametro/2,y-diametro/2,diametro,diametro);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
