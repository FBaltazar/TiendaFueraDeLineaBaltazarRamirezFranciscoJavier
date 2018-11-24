package mx.edu.ittepic.dadm_u3__tclase_tiendita;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo5 extends View
{
    Imagen imgLogoCa,

    imgCaVentauno,imgCaVentaDos,imgCaVentanaTres,imgCaVentanaCuatro,

    imgCaGrandeUno,imgCaGrandeDos,imgCaGrandeTres,imgCaGrandeCuatro,

    lecturaCaUno,lecturaCaDos,lecturaCaTres,lecturaCaCuatro,

    imgLineaCategoria,lineaHorizontal,tapon;

    public Lienzo5(Context context)
    {
        super(context);

        tapon = new Imagen(R.drawable.tapon2, 1, 1, this);

        imgLogoCa = new Imagen(R.drawable.caretita,40 ,35,this);

        imgCaVentauno = new Imagen(R.drawable.mascarachicauno,6 ,400,this);
        imgCaVentaDos = new Imagen(R.drawable.mascarachicados,10,725,this);
        imgCaVentanaTres = new Imagen(R.drawable.mascarachicatres,10,1035,this);
        imgCaVentanaCuatro = new Imagen(R.drawable.mascarachicacuatro,10,1355,this);


        imgCaGrandeUno = new Imagen(R.drawable.mascaragrandeuno,340,75,this);
        imgCaGrandeDos = new Imagen(R.drawable.mascaragrandedos,340,75,this);
        imgCaGrandeTres = new Imagen(R.drawable.mascaragrandetres,340,75,this);
        imgCaGrandeCuatro = new Imagen(R.drawable.mascaragrandecuatro,340,75,this);

        lecturaCaUno = new Imagen(R.drawable.textomuno,360,685,this);
        lecturaCaDos = new Imagen(R.drawable.textomdos,360,685,this);
        lecturaCaTres = new Imagen(R.drawable.textomtres,360,685,this);
        lecturaCaCuatro = new Imagen(R.drawable.textomcuatro,360,685,this);


        imgLineaCategoria = new Imagen(R.drawable.lineadecategoria3,290 ,365,this);
        lineaHorizontal = new Imagen(R.drawable.lineahorizontal,0 ,365,this);

        imgCaGrandeUno.hacerVisible(false);
        imgCaGrandeDos.hacerVisible(false);
        imgCaGrandeTres.hacerVisible(false);
        imgCaGrandeCuatro.hacerVisible(false);

        lecturaCaUno.hacerVisible(false);
        lecturaCaDos.hacerVisible(false);
        lecturaCaTres.hacerVisible(false);
        lecturaCaCuatro.hacerVisible(false);


    }

    public void onDraw(Canvas c)
    {
        super.onDraw(c);
        Paint p = new Paint();

        imgCaVentauno.pintar(c,p);
        imgCaVentaDos.pintar(c,p);
        imgCaVentanaTres.pintar(c,p);
        imgCaVentanaCuatro.pintar(c,p);

        imgCaGrandeUno.pintar(c,p);
        imgCaGrandeDos.pintar(c,p);
        imgCaGrandeTres.pintar(c,p);
        imgCaGrandeCuatro.pintar(c,p);


        lecturaCaUno.pintar(c,p);
        lecturaCaDos.pintar(c,p);
        lecturaCaTres.pintar(c,p);
        lecturaCaCuatro.pintar(c,p);

        tapon.pintar(c,p);

        imgLogoCa.pintar(c,p);

        imgLineaCategoria.pintar(c,p);
        lineaHorizontal.pintar(c,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e)
    {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction())
        {
            case MotionEvent.ACTION_DOWN:

                if (imgCaVentauno.estaEnArea(xp,yp))
                {
                    imgCaGrandeUno.hacerVisible(true);
                    lecturaCaUno.hacerVisible(true);
                    imgCaGrandeDos.hacerVisible(false);
                    lecturaCaDos.hacerVisible(false);
                    imgCaGrandeTres.hacerVisible(false);
                    lecturaCaTres.hacerVisible(false);
                    imgCaGrandeCuatro.hacerVisible(false);
                    lecturaCaCuatro.hacerVisible(false);
                }
                if (imgCaVentaDos.estaEnArea(xp,yp))
                {
                    imgCaGrandeUno.hacerVisible(false);
                    lecturaCaUno.hacerVisible(false);
                    imgCaGrandeDos.hacerVisible(true);
                    lecturaCaDos.hacerVisible(true);
                    imgCaGrandeTres.hacerVisible(false);
                    lecturaCaTres.hacerVisible(false);
                    imgCaGrandeCuatro.hacerVisible(false);
                    lecturaCaCuatro.hacerVisible(false);
                }
                if (imgCaVentanaTres.estaEnArea(xp,yp))
                {
                    imgCaGrandeUno.hacerVisible(false);
                    lecturaCaUno.hacerVisible(false);
                    imgCaGrandeDos.hacerVisible(false);
                    lecturaCaDos.hacerVisible(false);
                    imgCaGrandeTres.hacerVisible(true);
                    lecturaCaTres.hacerVisible(true);
                    imgCaGrandeCuatro.hacerVisible(false);
                    lecturaCaCuatro.hacerVisible(false);
                }
                if (imgCaVentanaCuatro.estaEnArea(xp,yp))
                {
                    imgCaGrandeUno.hacerVisible(false);
                    lecturaCaUno.hacerVisible(false);
                    imgCaGrandeDos.hacerVisible(false);
                    lecturaCaDos.hacerVisible(false);
                    imgCaGrandeTres.hacerVisible(false);
                    lecturaCaTres.hacerVisible(false);
                    imgCaGrandeCuatro.hacerVisible(true);
                    lecturaCaCuatro.hacerVisible(true);
                }
                break;
            case MotionEvent.ACTION_MOVE:
                if (imgCaVentauno.estaEnArea(xp,yp))
                {
                    imgCaVentauno.movery(yp);
                    imgCaVentaDos.movery(imgCaVentauno.renviarPosicionEnY()+450);
                    imgCaVentanaTres.movery(imgCaVentaDos.renviarPosicionEnY()+444);
                    imgCaVentanaCuatro.movery(imgCaVentanaTres.renviarPosicionEnY()+444);
                }
                if (imgCaVentaDos.estaEnArea(xp,yp))
                {
                    imgCaVentaDos.movery(yp);
                    imgCaVentauno.movery(imgCaVentaDos.renviarPosicionEnY()-191);
                    imgCaVentanaTres.movery(imgCaVentaDos.renviarPosicionEnY()+450);
                    imgCaVentanaCuatro.movery(imgCaVentanaTres.renviarPosicionEnY()+450);
                }
                if (imgCaVentanaTres.estaEnArea(xp,yp))
                {
                    imgCaVentanaTres.movery(yp);
                    imgCaVentaDos.movery(imgCaVentanaTres.renviarPosicionEnY()-188);
                    imgCaVentauno.movery(imgCaVentaDos.renviarPosicionEnY()-190);
                    imgCaVentanaCuatro.movery(imgCaVentanaTres.renviarPosicionEnY()+450);
                }
                if (imgCaVentanaCuatro.estaEnArea(xp,yp))
                {
                    imgCaVentanaCuatro.movery(yp);
                    imgCaVentanaTres.movery(imgCaVentanaCuatro.renviarPosicionEnY()-190);
                    imgCaVentaDos.movery(imgCaVentanaTres.renviarPosicionEnY()-190);
                    imgCaVentauno.movery(imgCaVentaDos.renviarPosicionEnY()-190);
                }
                break;
        }

        invalidate();
        return true;
    }
}
