package mx.edu.ittepic.dadm_u3__tclase_tiendita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setContentView(new Lienzo5(this));
    }
}
