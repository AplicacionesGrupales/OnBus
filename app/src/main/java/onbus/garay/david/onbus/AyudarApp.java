package onbus.garay.david.onbus;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by david on 12/11/2016.
 */
public class AyudarApp extends AppCompatActivity {

    private String[] lv_arr = {};

    private ListView mListView;
    TextView TVAyuda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayudar);
        TVAyuda = (TextView)findViewById(R.id.TV_Ayuda);
        String font_path = "font/Cursive standard Bold.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        TVAyuda.setTypeface(TF);

        mListView = (ListView) findViewById(R.id.lista_ayuda);
        String []listItems = new String[10];
        listItems= new String[]{"Paradas","Ubicar Camion","Calcular Rutas","Tareas"};
        ArrayAdapter adapter = new ArrayAdapter(AyudarApp.this, android.R.layout.simple_selectable_list_item, listItems);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                switch (position) {
                    case 0:         Intent ListSong = new Intent(getApplicationContext(), AyudarParadasApp.class);
                        startActivity(ListSong);
                        break;
                    case 1: Intent ListSong2 = new Intent(getApplicationContext(), AyudarUbicarApp.class);
                        startActivity(ListSong2);
                        break;
                    case 2: Intent ListSong3 = new Intent(getApplicationContext(),AyudarCalcularApp.class);
                        startActivity(ListSong3);
                        break;
                    case 3: Intent ListSong4 = new Intent(getApplicationContext(), AyudarTareasApp.class);
                        startActivity(ListSong4);
                        break;
                    default:Toast.makeText(getBaseContext(), "Opcion No valida", Toast.LENGTH_LONG).show();
                }


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.inicio_app, menu);
        return true;
    }



}
