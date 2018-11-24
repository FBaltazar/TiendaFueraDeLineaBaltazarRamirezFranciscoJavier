package mx.edu.ittepic.dadm_u3__tclase_tiendita;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Imagen
{

    private Bitmap imagen;
    private float x,y;
    private boolean visible;


    public Imagen(int resource,float _x,float _y,Lienzo l)
    {
        imagen = BitmapFactory.decodeResource(l.getResources(),resource);
        x = _x;
        y = _y;
        visible = true;
    }

    public Imagen(int resource,float _x,float _y,Lienzo2 l)
    {
        imagen = BitmapFactory.decodeResource(l.getResources(),resource);
        x = _x;
        y = _y;
        visible = true;
    }

    public Imagen(int resource,float _x,float _y,Lienzo3 l)
    {
        imagen = BitmapFactory.decodeResource(l.getResources(),resource);
        x = _x;
        y = _y;
        visible = true;
    }

    public Imagen(int resource,float _x,float _y,Lienzo4 l)
    {
        imagen = BitmapFactory.decodeResource(l.getResources(),resource);
        x = _x;
        y = _y;
        visible = true;
    }

    public Imagen(int resource,float _x,float _y,Lienzo5 l)
    {
        imagen = BitmapFactory.decodeResource(l.getResources(),resource);
        x = _x;
        y = _y;
        visible = true;
    }

    public void pintar(Canvas c, Paint p)
    {
        if (visible)
        c.drawBitmap(imagen,x,y,p);
    }
    public void hacerVisible(boolean v)
    {
        visible=v;
    }

    public boolean estaEnArea(float xp,float yp)
    {
        if (!visible) return false;

        float x2,y2;

        x2 = x + imagen.getWidth();
        y2 = y + imagen.getHeight();

        if(xp >= x && xp <= x2)
        {
            if (yp >= y && yp <= y2)
            {
                return true;
            }
        }

        return false;
    }



    public void mover(float xp)
    {
        x = xp - (imagen.getWidth()/2);
    }

    public float renviarPosicionEnX()
    {
        return x;
    }

    public void movery(float yp)
    {
        y = yp - (imagen.getWidth()/2);
    }

    public float renviarPosicionEnY()
    {
        return y;
    }

}
