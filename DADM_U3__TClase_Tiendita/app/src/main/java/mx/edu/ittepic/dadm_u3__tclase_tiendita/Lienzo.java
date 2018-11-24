package mx.edu.ittepic.dadm_u3__tclase_tiendita;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {
    MainActivity p;
    Imagen imglogo, imgnombreapp, imgCategoria,

    imgApartadoGuantes,
            imgApartadoShorts,
            imgApartadoGi,
            imgApartadoCaretas,

    imgbtnentrar,imgbtnentrardos,imgbtnentrartres,imgbtnentrarcuatro,

    imgLineaCategoria,

    imgAnuncioguante,imgAnuncioshort,imgAnuncioGi,imgAnuncioCareta;

    public Lienzo(Context context) {
        super(context);
        p = (MainActivity) context;
        imglogo = new Imagen(R.drawable.logok1, 25, 25, this);
        imgnombreapp = new Imagen(R.drawable.nombrecatalogo3, 235, 25, this);

        imgCategoria = new Imagen(R.drawable.categoria, 2, 355, this);

        imgApartadoGuantes = new Imagen(R.drawable.guantescalis2, 25, 427, this);
        imgApartadoShorts = new Imagen(R.drawable.shortonones, 290, 427, this);
        imgApartadoGi = new Imagen(R.drawable.gid1, 585, 427, this);
        imgApartadoCaretas = new Imagen(R.drawable.caretita, 855, 427, this);

        imgLineaCategoria = new Imagen(R.drawable.lineadecategoria, 2, 720, this);

        imgAnuncioguante = new Imagen(R.drawable.boxitobien, 25, 728, this);
        imgAnuncioshort = new Imagen(R.drawable.textoshortprin, 35, 735, this);
        imgAnuncioGi = new Imagen(R.drawable.textogiprin, 35, 735, this);
        imgAnuncioCareta = new Imagen(R.drawable.textocaretaprin, 35, 735, this);

        imgbtnentrar = new Imagen(R.drawable.btnacceder2, 595, 950, this);
        imgbtnentrardos = new Imagen(R.drawable.btnacceder2, 595, 950, this);
        imgbtnentrartres = new Imagen(R.drawable.btnacceder2, 595, 950, this);
        imgbtnentrarcuatro = new Imagen(R.drawable.btnacceder2, 595, 950, this);

        imgAnuncioguante.hacerVisible(false);
        imgAnuncioshort.hacerVisible(false);
        imgAnuncioGi.hacerVisible(false);
        imgAnuncioCareta.hacerVisible(false);

        imgbtnentrar.hacerVisible(false);
        imgbtnentrardos.hacerVisible(false);
        imgbtnentrartres.hacerVisible(false);
        imgbtnentrarcuatro.hacerVisible(false);
    }

    @Override
    public void onDraw(Canvas c)
    {
        Paint p = new Paint();

        imglogo.pintar(c, p);
        imgnombreapp.pintar(c, p);

        imgCategoria.pintar(c, p);

        imgApartadoGuantes.pintar(c, p);
        imgApartadoShorts.pintar(c, p);
        imgApartadoGi.pintar(c, p);
        imgApartadoCaretas.pintar(c, p);

        imgAnuncioguante.pintar(c, p);
        imgAnuncioshort.pintar(c,p);
        imgAnuncioGi.pintar(c,p);
        imgAnuncioCareta.pintar(c,p);

        imgbtnentrar.pintar(c, p);
        imgbtnentrardos.pintar(c, p);
        imgbtnentrartres.pintar(c, p);
        imgbtnentrarcuatro.pintar(c, p);

        imgLineaCategoria.pintar(c, p);


    }
    public boolean onTouchEvent(MotionEvent e)
    {
        float xp = e.getX();
        float yp = e.getY();
        switch (e.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                if (imgbtnentrar.estaEnArea(xp, yp))
                {
                    p.v1();
                }
                if (imgbtnentrardos.estaEnArea(xp,yp))
                {
                    p.v2();
                }
                if (imgbtnentrartres.estaEnArea(xp,yp))
                {
                    p.v3();
                }
                if (imgbtnentrarcuatro.estaEnArea(xp,yp))
                {
                    p.v4();
                }

                if (imgApartadoGuantes.estaEnArea(xp,yp))
                {
                    imgAnuncioguante.hacerVisible(true);
                    imgbtnentrar.hacerVisible(true);
                    imgAnuncioshort.hacerVisible(false);
                    imgbtnentrardos.hacerVisible(false);
                    imgAnuncioGi.hacerVisible(false);
                    imgbtnentrartres.hacerVisible(false);
                    imgAnuncioCareta.hacerVisible(false);
                    imgbtnentrarcuatro.hacerVisible(false);

                }
                if (imgApartadoShorts.estaEnArea(xp,yp))
                {
                    imgAnuncioguante.hacerVisible(false);
                    imgbtnentrar.hacerVisible(false);
                    imgAnuncioshort.hacerVisible(true);
                    imgbtnentrardos.hacerVisible(true);
                    imgAnuncioGi.hacerVisible(false);
                    imgbtnentrartres.hacerVisible(false);
                    imgAnuncioCareta.hacerVisible(false);
                    imgbtnentrarcuatro.hacerVisible(false);

                }
                if (imgApartadoGi.estaEnArea(xp,yp))
                {
                    imgAnuncioguante.hacerVisible(false);
                    imgbtnentrar.hacerVisible(false);
                    imgAnuncioshort.hacerVisible(false);
                    imgbtnentrardos.hacerVisible(false);
                    imgAnuncioGi.hacerVisible(true);
                    imgbtnentrartres.hacerVisible(true);
                    imgAnuncioCareta.hacerVisible(false);
                    imgbtnentrarcuatro.hacerVisible(false);

                }
                if (imgApartadoCaretas.estaEnArea(xp,yp))
                {
                    imgAnuncioguante.hacerVisible(false);
                    imgbtnentrar.hacerVisible(false);
                    imgAnuncioshort.hacerVisible(false);
                    imgbtnentrardos.hacerVisible(false);
                    imgAnuncioGi.hacerVisible(false);
                    imgbtnentrartres.hacerVisible(false);
                    imgAnuncioCareta.hacerVisible(true);
                    imgbtnentrarcuatro.hacerVisible(true);

                }

                break;
            case MotionEvent.ACTION_MOVE:
                if (imgApartadoGuantes.estaEnArea(xp, yp))
                {
                    imgApartadoGuantes.mover(xp);
                    imgApartadoShorts.mover(imgApartadoGuantes.renviarPosicionEnX() + 350);
                    imgApartadoGi.mover(imgApartadoShorts.renviarPosicionEnX() + 390);
                    imgApartadoCaretas.mover(imgApartadoGi.renviarPosicionEnX() + 390);
                }
                if (imgApartadoShorts.estaEnArea(xp,yp))
                {
                    imgApartadoShorts.mover(xp);
                    imgApartadoGuantes.mover(imgApartadoShorts.renviarPosicionEnX()-180);
                    imgApartadoGi.mover(imgApartadoShorts.renviarPosicionEnX()+390);
                    imgApartadoCaretas.mover(imgApartadoGi.renviarPosicionEnX()+390);
                }
                if (imgApartadoGi.estaEnArea(xp,yp))
                {
                    imgApartadoGi.mover(xp);
                    imgApartadoShorts.mover(imgApartadoGi.renviarPosicionEnX()-185);
                    imgApartadoGuantes.mover(imgApartadoShorts.renviarPosicionEnX()-175);
                    imgApartadoCaretas.mover(imgApartadoGi.renviarPosicionEnX()+390);
                }
                if (imgApartadoCaretas.estaEnArea(xp,yp))
                {
                    imgApartadoCaretas.mover(xp);
                    imgApartadoGi.mover(imgApartadoCaretas.renviarPosicionEnX()-185);
                    imgApartadoShorts.mover(imgApartadoGi.renviarPosicionEnX()-175);
                    imgApartadoGuantes.mover(imgApartadoShorts.renviarPosicionEnX()-160);
                }
                break;
        }
        invalidate();
        return true;
    }
}
