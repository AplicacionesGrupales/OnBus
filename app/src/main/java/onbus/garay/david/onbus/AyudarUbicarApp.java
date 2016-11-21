package onbus.garay.david.onbus;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

/**
 * Created by david on 12/11/2016.
 */
public class AyudarUbicarApp extends AppCompatActivity {

    TextView TVAyudaU;
    TextView TVAyudaUT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda_ubicar);

        TVAyudaU = (TextView)findViewById(R.id.txt_ayuda_ubicarT);
        String font_path = "font/KGPrimaryItalics.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        TVAyudaU.setTypeface(TF);

        TVAyudaUT = (TextView)findViewById(R.id.txt_ayuda_ubicarTE);
        String font_pathT = "font/Precursive_1_FREE.otf";
        Typeface TFT = Typeface.createFromAsset(getAssets(),font_pathT);
        TVAyudaUT.setTypeface(TFT);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.inicio_app, menu);
        return true;
    }

}
