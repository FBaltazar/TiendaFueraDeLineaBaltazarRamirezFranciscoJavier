package mx.edu.ittepic.dadm_u3__tclase_tiendita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setContentView(new Lienzo4(this));
    }
}
