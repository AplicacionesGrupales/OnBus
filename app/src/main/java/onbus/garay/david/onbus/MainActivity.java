package onbus.garay.david.onbus;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                    Intent i=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {

                }
            }
        };

       /* Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); */


        btnIniciar = (Button) findViewById(R.id.portada_app);
        String font_path = "font/KGPrimaryItalics.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        btnIniciar.setTypeface(TF);



    }

    public void onIniciar(View v) {
        Intent ListSong = new Intent(getApplicationContext(), InicioApp.class);
        startActivity(ListSong);
    }

    public void onRegistrar(View v) {
        Intent ListSong = new Intent(getApplicationContext(), InicioApp.class);
        startActivity(ListSong);
    }
}
