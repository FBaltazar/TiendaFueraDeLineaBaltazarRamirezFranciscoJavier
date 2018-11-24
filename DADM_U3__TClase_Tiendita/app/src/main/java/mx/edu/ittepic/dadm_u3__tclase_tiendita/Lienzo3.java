package mx.edu.ittepic.dadm_u3__tclase_tiendita;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;


public class Lienzo3 extends View
{
    Imagen imgLogoShorts,

            imgShortVentauno,imgShortVentaDos,imgShortVentanaTres,imgShortVentanaCuatro,
                    imgShortGrandeUno,imgShortGrandeDos,imgShortGrandeTres,imgShortGrandeCuatro,
                    lecturaShortUno,lecturaShortDos,lecturaShortTres,lecturaShortCuatro,tapon,

                    imgLineaCategoria,lineaHorizontal;

    public Lienzo3(Context context)
    {
        super(context);

        tapon = new Imagen(R.drawable.tapon2, 1, 1, this);

        imgLogoShorts = new Imagen(R.drawable.shortonones,40 ,35,this);

        imgShortVentauno = new Imagen(R.drawable.shortone,6 ,400,this);
        imgShortVentaDos = new Imagen(R.drawable.shorttu,10,725,this);
        imgShortVentanaTres = new Imagen(R.drawable.shortri,10,1035,this);
        imgShortVentanaCuatro = new Imagen(R.drawable.shortfor,10,1355,this);


        imgShortGrandeUno = new Imagen(R.drawable.shortonegrand,340,75,this);
        imgShortGrandeDos = new Imagen(R.drawable.shorttugrandote,340,75,this);
        imgShortGrandeTres = new Imagen(R.drawable.shortrigrandote,340,75,this);
        imgShortGrandeCuatro = new Imagen(R.drawable.shortforgrandote,340,75,this);

        lecturaShortUno = new Imagen(R.drawable.boxertextone,360,685,this);
        lecturaShortDos = new Imagen(R.drawable.lecturashortdos,360,685,this);
        lecturaShortTres = new Imagen(R.drawable.lecturashorttres,360,685,this);
        lecturaShortCuatro = new Imagen(R.drawable.lecturashortcuatro,360,685,this);


        imgLineaCategoria = new Imagen(R.drawable.lineadecategoria3,290 ,365,this);
        lineaHorizontal = new Imagen(R.drawable.lineahorizontal,0 ,365,this);

        imgShortGrandeUno.hacerVisible(false);
        imgShortGrandeDos.hacerVisible(false);
        imgShortGrandeTres.hacerVisible(false);
        imgShortGrandeCuatro.hacerVisible(false);

        lecturaShortUno.hacerVisible(false);
        lecturaShortDos.hacerVisible(false);
        lecturaShortTres.hacerVisible(false);
        lecturaShortCuatro.hacerVisible(false);

    }

    @Override
    public void onDraw(Canvas c)
    {
        super.onDraw(c);
        Paint p = new Paint();

        imgShortVentauno.pintar(c,p);
        imgShortVentaDos.pintar(c,p);
        imgShortVentanaTres.pintar(c,p);
        imgShortVentanaCuatro.pintar(c,p);

        imgShortGrandeUno.pintar(c,p);
        imgShortGrandeDos.pintar(c,p);
        imgShortGrandeTres.pintar(c,p);
        imgShortGrandeCuatro.pintar(c,p);

        lecturaShortUno.pintar(c,p);
        lecturaShortDos.pintar(c,p);
        lecturaShortTres.pintar(c,p);
        lecturaShortCuatro.pintar(c,p);

        tapon.pintar(c,p);

        imgLogoShorts.pintar(c,p);

        imgLineaCategoria.pintar(c,p);
        lineaHorizontal.pintar(c,p);
    }

    public boolean onTouchEvent(MotionEvent e)
    {
        float xp = e.getX();
        float yp = e.getY();
        switch (e.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                if (imgShortVentauno.estaEnArea(xp,yp))
                {
                    imgShortGrandeUno.hacerVisible(true);
                    lecturaShortUno.hacerVisible(true);
                    imgShortGrandeDos.hacerVisible(false);
                    lecturaShortDos.hacerVisible(false);
                    imgShortGrandeTres.hacerVisible(false);
                    lecturaShortTres.hacerVisible(false);
                    imgShortGrandeCuatro.hacerVisible(false);
                    lecturaShortCuatro.hacerVisible(false);

                }
                if (imgShortVentaDos.estaEnArea(xp,yp))
                {
                    imgShortGrandeDos.hacerVisible(true);
                    lecturaShortDos.hacerVisible(true);
                    imgShortGrandeUno.hacerVisible(false);
                    lecturaShortUno.hacerVisible(false);
                    imgShortGrandeTres.hacerVisible(false);
                    lecturaShortTres.hacerVisible(false);
                    imgShortGrandeCuatro.hacerVisible(false);
                    lecturaShortCuatro.hacerVisible(false);

                }
                if (imgShortVentanaTres.estaEnArea(xp,yp))
                {
                    imgShortGrandeTres.hacerVisible(true);
                    lecturaShortTres.hacerVisible(true);
                    imgShortGrandeDos.hacerVisible(false);
                    lecturaShortDos.hacerVisible(false);
                    imgShortGrandeUno.hacerVisible(false);
                    lecturaShortUno.hacerVisible(false);
                    imgShortGrandeCuatro.hacerVisible(false);
                    lecturaShortCuatro.hacerVisible(false);

                }
                if (imgShortVentanaCuatro.estaEnArea(xp,yp))
                {
                    imgShortGrandeUno.hacerVisible(false);
                    lecturaShortUno.hacerVisible(false);
                    imgShortGrandeDos.hacerVisible(false);
                    lecturaShortDos.hacerVisible(false);
                    imgShortGrandeTres.hacerVisible(false);
                    lecturaShortTres.hacerVisible(false);
                    imgShortGrandeCuatro.hacerVisible(true);
                    lecturaShortCuatro.hacerVisible(true);

                }
                break;
            case MotionEvent.ACTION_MOVE:
                if (imgShortVentauno.estaEnArea(xp,yp))
                {
                    imgShortVentauno.movery(yp);
                    imgShortVentaDos.movery(imgShortVentauno.renviarPosicionEnY()+457);
                    imgShortVentanaTres.movery(imgShortVentaDos.renviarPosicionEnY()+438);
                    imgShortVentanaCuatro.movery(imgShortVentanaTres.renviarPosicionEnY()+438);
                }
                if (imgShortVentaDos.estaEnArea(xp,yp))
                {
                    imgShortVentaDos.movery(yp);
                    imgShortVentauno.movery(imgShortVentaDos.renviarPosicionEnY()-190);
                    imgShortVentanaTres.movery(imgShortVentaDos.renviarPosicionEnY()+438);
                    imgShortVentanaCuatro.movery(imgShortVentanaTres.renviarPosicionEnY()+438);
                }
                if (imgShortVentanaTres.estaEnArea(xp,yp))
                {
                    imgShortVentanaTres.movery(yp);
                    imgShortVentanaCuatro.movery(imgShortVentanaTres.renviarPosicionEnY()+438);
                    imgShortVentaDos.movery(imgShortVentanaTres.renviarPosicionEnY()-190);
                    imgShortVentauno.movery(imgShortVentaDos.renviarPosicionEnY()-190);
                }
                if (imgShortVentanaCuatro.estaEnArea(xp,yp))
                {
                    imgShortVentanaCuatro.movery(yp);
                    imgShortVentanaTres.movery(imgShortVentanaCuatro.renviarPosicionEnY()-190);
                    imgShortVentaDos.movery(imgShortVentanaTres.renviarPosicionEnY()-190);
                    imgShortVentauno.movery(imgShortVentaDos.renviarPosicionEnY()-190);
                }
                break;
        }
        invalidate();
        return true;
    }
}
