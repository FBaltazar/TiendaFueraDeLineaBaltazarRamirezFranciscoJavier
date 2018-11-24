package mx.edu.ittepic.dadm_u3__tclase_tiendita;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo2 extends View
{
    Imagen imgLogoGuantess,
            imgGuanteVentauno,imgGuantesDos,imgBoxitotres,imgGuanteCuatro,
            imgGuanteGrande,imgGuantesGrandesDos,imgGuantesGrandesTres,imgGuanteGrandeCuatro,
            lecturaGuantesDos,lecturaGuantesTres,lecturaGuantesUno,lecturaGuanteCuatro,
            imgLineaCategoria,lineaHorizontal,tapon;

    public Lienzo2(Context context) {
        super(context);

        imgLogoGuantess = new Imagen(R.drawable.guantescalis2, 40, 35, this);

        tapon = new Imagen(R.drawable.tapon2, 1, 1, this);

        imgGuanteVentauno = new Imagen(R.drawable.guaunomejorsinidos, 6, 400, this);
        imgGuantesDos = new Imagen(R.drawable.pachi, 10, 725, this);
        imgBoxitotres = new Imagen(R.drawable.ga, 10, 1035, this);
        imgGuanteCuatro = new Imagen(R.drawable.imgguantecuatrito,10,1270,this);

        imgGuanteGrande = new Imagen(R.drawable.guaunogrande,340,75,this);
        imgGuantesGrandesDos = new Imagen(R.drawable.guantedosgrandote,380,115,this);
        imgGuantesGrandesTres = new Imagen(R.drawable.guantesgrandestres,340,75,this);
        imgGuanteGrandeCuatro = new Imagen(R.drawable.guantegrandecuatro,340,75,this);


        lecturaGuantesUno = new Imagen(R.drawable.lguanteuno,360,685,this);
        lecturaGuantesDos = new Imagen(R.drawable.lecturaguantesdos,360,685,this);
        lecturaGuantesTres = new Imagen(R.drawable.textoguantesinitres,360,685,this);
        lecturaGuanteCuatro = new Imagen(R.drawable.lecturaguantecuatro,360,685,this);

        lineaHorizontal = new Imagen(R.drawable.lineahorizontal,0 ,365,this);
        imgLineaCategoria = new Imagen(R.drawable.lineadecategoria3,290 ,365,this);

        lecturaGuantesUno.hacerVisible(false);
        lecturaGuantesDos.hacerVisible(false);
        lecturaGuantesTres.hacerVisible(false);
        lecturaGuanteCuatro.hacerVisible(false);

        imgGuanteGrande.hacerVisible(false);
        imgGuantesGrandesDos.hacerVisible(false);
        imgGuantesGrandesTres.hacerVisible(false);
        imgGuanteGrandeCuatro.hacerVisible(false);


    }

    @Override
    public void onDraw(Canvas c)
    {
        super.onDraw(c);
        Paint p = new Paint();


        imgGuanteVentauno.pintar(c,p);
        imgGuantesDos.pintar(c,p);
        imgBoxitotres.pintar(c,p);
        imgGuanteCuatro.pintar(c,p);

        lecturaGuantesUno.pintar(c,p);
        lecturaGuantesDos.pintar(c,p);
        lecturaGuantesTres.pintar(c,p);
        lecturaGuanteCuatro.pintar(c,p);

        imgGuanteGrande.pintar(c,p);
        imgGuantesGrandesDos.pintar(c,p);
        imgGuantesGrandesTres.pintar(c,p);
        imgGuanteGrandeCuatro.pintar(c,p);

        tapon.pintar(c,p);
        imgLogoGuantess.pintar(c,p);

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
                if (imgGuanteVentauno.estaEnArea(xp,yp))
                {
                    imgGuanteGrande.hacerVisible(true);
                    lecturaGuantesUno.hacerVisible(true);
                    imgGuantesGrandesDos.hacerVisible(false);
                    lecturaGuantesDos.hacerVisible(false);
                    imgGuantesGrandesTres.hacerVisible(false);
                    lecturaGuantesTres.hacerVisible(false);
                    imgGuanteGrandeCuatro.hacerVisible(false);
                    lecturaGuanteCuatro.hacerVisible(false);

                }
                if (imgGuantesDos.estaEnArea(xp,yp))
                {
                    imgGuantesGrandesDos.hacerVisible(true);
                    lecturaGuantesDos.hacerVisible(true);
                    imgGuanteGrande.hacerVisible(false);
                    lecturaGuantesUno.hacerVisible(false);
                    imgGuantesGrandesTres.hacerVisible(false);
                    lecturaGuantesTres.hacerVisible(false);
                    imgGuanteGrandeCuatro.hacerVisible(false);
                    lecturaGuanteCuatro.hacerVisible(false);

                }
                if (imgBoxitotres.estaEnArea(xp,yp))
                {
                    imgGuantesGrandesTres.hacerVisible(true);
                    lecturaGuantesTres.hacerVisible(true);
                    imgGuanteGrande.hacerVisible(false);
                    lecturaGuantesUno.hacerVisible(false);
                    imgGuantesGrandesDos.hacerVisible(false);
                    lecturaGuantesDos.hacerVisible(false);
                    imgGuanteGrandeCuatro.hacerVisible(false);
                    lecturaGuanteCuatro.hacerVisible(false);

                }
                if (imgGuanteCuatro.estaEnArea(xp,yp))
                {
                    imgGuanteGrandeCuatro.hacerVisible(true);
                    lecturaGuanteCuatro.hacerVisible(true);
                    imgGuanteGrande.hacerVisible(false);
                    lecturaGuantesUno.hacerVisible(false);
                    imgGuantesGrandesDos.hacerVisible(false);
                    lecturaGuantesDos.hacerVisible(false);
                    imgGuantesGrandesTres.hacerVisible(false);
                    lecturaGuantesTres.hacerVisible(false);

                }
                break;
            case MotionEvent.ACTION_MOVE:
                if (imgGuanteVentauno.estaEnArea(xp,yp))
                {
                    imgGuanteVentauno.movery(yp);
                    imgGuantesDos.movery(imgGuanteVentauno.renviarPosicionEnY()+456);
                    imgBoxitotres.movery(imgGuantesDos.renviarPosicionEnY()+455);
                    imgGuanteCuatro.movery(imgBoxitotres.renviarPosicionEnY()+455);
                }
                if (imgGuantesDos.estaEnArea(xp,yp))
                {
                    imgGuantesDos.movery(yp);
                    imgGuanteVentauno.movery(imgGuantesDos.renviarPosicionEnY()-182);
                    imgBoxitotres.movery(imgGuantesDos.renviarPosicionEnY()+455);
                    imgGuanteCuatro.movery(imgBoxitotres.renviarPosicionEnY()+455);
                }
                if (imgBoxitotres.estaEnArea(xp,yp))
                {
                    imgBoxitotres.movery(yp);
                    imgGuantesDos.movery(imgBoxitotres.renviarPosicionEnY()-182);
                    imgGuanteVentauno.movery(imgGuantesDos.renviarPosicionEnY()-182);
                    imgGuanteCuatro.movery(imgBoxitotres.renviarPosicionEnY()+455);
                }
                if (imgGuanteCuatro.estaEnArea(xp,yp))
                {
                    imgGuanteCuatro.movery(yp);
                    imgBoxitotres.movery(imgGuanteCuatro.renviarPosicionEnY()-182);
                    imgGuantesDos.movery(imgBoxitotres.renviarPosicionEnY()-182);
                    imgGuanteVentauno.movery(imgGuantesDos.renviarPosicionEnY()-182);
                }
                break;
        }
        invalidate();
        return true;
    }

}
