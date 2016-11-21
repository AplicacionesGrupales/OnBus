package onbus.garay.david.onbus;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by david on 11/11/2016.
 */
public class InicioApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.inicio_app, menu);

        return true;
    }

    public void paradas(View v) {
        Intent ListSong = new Intent(getApplicationContext(), ParadasApp.class);
        startActivity(ListSong);
    }

    public void ubicar(View v) {
        Intent ListSong = new Intent(getApplicationContext(), UbicarApp.class);
        startActivity(ListSong);
    }

    public void calcular(View v) {
        Intent ListSong = new Intent(getApplicationContext(), CalcularApp.class);
        startActivity(ListSong);
    }

    public void tareas(View v) {
        Intent ListSong = new Intent(getApplicationContext(), TareasApp.class);
        startActivity(ListSong);
    }

    public void ayuda(View v) {
        Intent ListSong = new Intent(getApplicationContext(), AyudarApp.class);
        startActivity(ListSong);
    }




    /*public void onClick(View v) {
        ImageButton btn_paradas = (ImageButton) findViewById(R.id.btn_paradas);
        ImageButton btn_ubicar = (ImageButton) findViewById(R.id.btn_ubicar);
        ImageButton btn_calcular = (ImageButton) findViewById(R.id.btn_calcular);
        ImageButton btn_tareas = (ImageButton) findViewById(R.id.btn_tareas);
        ImageButton btn_ayudas = (ImageButton) findViewById(R.id.btn_ayuda);


        if (btn_paradas.isSelected()) {
            Toast.makeText(this,"paradas",Toast.LENGTH_LONG).show();
        }
        if (btn_ubicar.isSelected()) {
            Toast.makeText(this,"ubicar",Toast.LENGTH_LONG).show();
        }
        if (btn_calcular.isSelected()) {
            Toast.makeText(this,"calcular",Toast.LENGTH_LONG).show();
        }
        if (btn_tareas.isSelected()) {
            Toast.makeText(this,"tareas",Toast.LENGTH_LONG).show();
        } if (btn_ayudas.isSelected()) {
            Toast.makeText(this,"ayuda",Toast.LENGTH_LONG).show();
        }

        /*int[] ids=new int[]{btn_paradas.getId(),btn_ubicar.getId()};

         switch (ids) {
            case ids[10]:
                Toast.makeText(this,"paradas",Toast.LENGTH_LONG);
                break;
            default:
                Toast.makeText(this,"Ninguno",Toast.LENGTH_LONG);
        }

    }*/


}
