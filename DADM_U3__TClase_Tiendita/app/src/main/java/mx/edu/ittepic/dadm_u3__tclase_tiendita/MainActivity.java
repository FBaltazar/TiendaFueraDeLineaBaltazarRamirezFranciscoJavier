package mx.edu.ittepic.dadm_u3__tclase_tiendita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(new Lienzo(this));
        }
        public void v1()
        {
            Intent ven = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(ven);
        }
        public void v2()
        {
            Intent ven2 = new Intent(MainActivity.this,Main3Activity.class);
            startActivity(ven2);
        }
        public void v3()
        {
            Intent ven3 = new Intent(MainActivity.this,Main4Activity.class);
            startActivity(ven3);
        }
        public void v4()
        {
            Intent ven4 = new Intent(MainActivity.this,Main5Activity.class);
            startActivity(ven4);
        }
}

