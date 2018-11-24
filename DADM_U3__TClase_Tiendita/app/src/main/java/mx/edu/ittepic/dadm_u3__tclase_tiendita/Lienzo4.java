package mx.edu.ittepic.dadm_u3__tclase_tiendita;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo4 extends View
{
    Imagen imgLogoGi,

            imgGiVentauno,imgGiVentaDos,imgGiVentanaTres,imgGiVentanaCuatro,

            imgGiGrandeUno,imgGiGrandeDos,imgGiGrandeTres,imgGiGrandeCuatro,

            lecturaGiUno,lecturaGiDos,lecturaGiTres,lecturaGiCuatro,

            imgLineaCategoria,lineaHorizontal,tapon;

    public Lienzo4(Context context)
    {
        super(context);

        imgGiVentauno = new Imagen(R.drawable.giuno,6 ,400,this);
        imgGiVentaDos = new Imagen(R.drawable.gidos,10,725,this);
        imgGiVentanaTres = new Imagen(R.drawable.gitres,10,1035,this);
        imgGiVentanaCuatro = new Imagen(R.drawable.gicuatro,10,1355,this);


        imgGiGrandeUno = new Imagen(R.drawable.giunogrande,340,75,this);
        imgGiGrandeDos = new Imagen(R.drawable.gidosgrande,340,75,this);
        imgGiGrandeTres = new Imagen(R.drawable.gitresgrande,340,75,this);
        imgGiGrandeCuatro = new Imagen(R.drawable.gicuatrogrande,340,75,this);

        lecturaGiUno = new Imagen(R.drawable.textogiuno,360,685,this);
        lecturaGiDos = new Imagen(R.drawable.textogidos,360,685,this);
        lecturaGiTres = new Imagen(R.drawable.textogitres,360,685,this);
        lecturaGiCuatro = new Imagen(R.drawable.textogicuatro,360,685,this);

        imgLogoGi = new Imagen(R.drawable.gid1,40 ,35,this);

        tapon = new Imagen(R.drawable.tapon2, 1, 1, this);

        imgLineaCategoria = new Imagen(R.drawable.lineadecategoria3,290 ,365,this);
        lineaHorizontal = new Imagen(R.drawable.lineahorizontal,0 ,365,this);

        imgGiGrandeUno.hacerVisible(false);
        imgGiGrandeDos.hacerVisible(false);
        imgGiGrandeTres.hacerVisible(false);
        imgGiGrandeCuatro.hacerVisible(false);

        lecturaGiUno.hacerVisible(false);
        lecturaGiDos.hacerVisible(false);
        lecturaGiTres.hacerVisible(false);
        lecturaGiCuatro.hacerVisible(false);

    }

    public void onDraw(Canvas c)
    {
        super.onDraw(c);
        Paint p = new Paint();


        imgGiVentauno.pintar(c,p);
        imgGiVentaDos.pintar(c,p);
        imgGiVentanaTres.pintar(c,p);
        imgGiVentanaCuatro.pintar(c,p);

        imgGiGrandeUno.pintar(c,p);
        imgGiGrandeDos.pintar(c,p);
        imgGiGrandeTres.pintar(c,p);
        imgGiGrandeCuatro.pintar(c,p);


        lecturaGiUno.pintar(c,p);
        lecturaGiDos.pintar(c,p);
        lecturaGiTres.pintar(c,p);
        lecturaGiCuatro.pintar(c,p);

        tapon.pintar(c,p);

        imgLogoGi.pintar(c,p);

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
                if (imgGiVentauno.estaEnArea(xp,yp))
                {
                    imgGiGrandeUno.hacerVisible(true);
                    lecturaGiUno.hacerVisible(true);
                    imgGiGrandeDos.hacerVisible(false);
                    lecturaGiDos.hacerVisible(false);
                    imgGiGrandeTres.hacerVisible(false);
                    lecturaGiTres.hacerVisible(false);
                    imgGiGrandeCuatro.hacerVisible(false);
                    lecturaGiCuatro.hacerVisible(false);
                }
                if (imgGiVentaDos.estaEnArea(xp,yp))
                {
                    imgGiGrandeUno.hacerVisible(false);
                    lecturaGiUno.hacerVisible(false);
                    imgGiGrandeDos.hacerVisible(true);
                    lecturaGiDos.hacerVisible(true);
                    imgGiGrandeTres.hacerVisible(false);
                    lecturaGiTres.hacerVisible(false);
                    imgGiGrandeCuatro.hacerVisible(false);
                    lecturaGiCuatro.hacerVisible(false);

                }
                if (imgGiVentanaTres.estaEnArea(xp,yp))
                {
                    imgGiGrandeUno.hacerVisible(false);
                    lecturaGiUno.hacerVisible(false);
                    imgGiGrandeDos.hacerVisible(false);
                    lecturaGiDos.hacerVisible(false);
                    imgGiGrandeTres.hacerVisible(true);
                    lecturaGiTres.hacerVisible(true);
                    imgGiGrandeCuatro.hacerVisible(false);
                    lecturaGiCuatro.hacerVisible(false);
                }
                if (imgGiVentanaCuatro.estaEnArea(xp,yp))
                {
                    imgGiGrandeUno.hacerVisible(false);
                    lecturaGiUno.hacerVisible(false);
                    imgGiGrandeDos.hacerVisible(false);
                    lecturaGiDos.hacerVisible(false);
                    imgGiGrandeTres.hacerVisible(false);
                    lecturaGiTres.hacerVisible(false);
                    imgGiGrandeCuatro.hacerVisible(true);
                    lecturaGiCuatro.hacerVisible(true);
                }
                break;
            case MotionEvent.ACTION_MOVE:
                if (imgGiVentauno.estaEnArea(xp,yp))
                {
                    imgGiVentauno.movery(yp);
                    imgGiVentaDos.movery(imgGiVentauno.renviarPosicionEnY()+455);
                    imgGiVentanaTres.movery(imgGiVentaDos.renviarPosicionEnY()+440);
                    imgGiVentanaCuatro.movery(imgGiVentanaTres.renviarPosicionEnY()+440);
                }
                if (imgGiVentaDos.estaEnArea(xp,yp))
                {
                    imgGiVentaDos.movery(yp);
                    imgGiVentauno.movery(imgGiVentaDos.renviarPosicionEnY()-187);
                    imgGiVentanaTres.movery(imgGiVentaDos.renviarPosicionEnY()+441);
                    imgGiVentanaCuatro.movery(imgGiVentanaTres.renviarPosicionEnY()+440);
                }
                if (imgGiVentanaTres.estaEnArea(xp,yp))
                {
                    imgGiVentanaTres.movery(yp);
                    imgGiVentanaCuatro.movery(imgGiVentanaTres.renviarPosicionEnY()+440);
                    imgGiVentaDos.movery(imgGiVentanaTres.renviarPosicionEnY()-191);
                    imgGiVentauno.movery(imgGiVentaDos.renviarPosicionEnY()-187);
                }
                if (imgGiVentanaCuatro.estaEnArea(xp,yp))
                {
                    imgGiVentanaCuatro.movery(yp);
                    imgGiVentanaTres.movery(imgGiVentanaCuatro.renviarPosicionEnY()-1);
                    imgGiVentaDos.movery(imgGiVentanaTres.renviarPosicionEnY()-1);
                    imgGiVentauno.movery(imgGiVentaDos.renviarPosicionEnY()-1);
                }
                break;

        }
        invalidate();
        return true;
    }
}
