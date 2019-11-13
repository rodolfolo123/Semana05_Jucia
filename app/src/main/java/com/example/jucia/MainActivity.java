package com.example.jucia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
//importando libreria para el boton
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnProducts;
    private Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);//Enlazamos activity con layout

        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);

        btnProducts.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Log.i(Settings.INFO,"Productos");

                //Intent Para cambiar de pantalla
                Intent i = new Intent(MainActivity.this,
                        ProductListActivity.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Log.i(Settings.INFO,"About us");
                Intent i = new Intent(MainActivity.this,
                        AboutUsActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume(){ // Este codigo se ejecuta antes de todo.
        super.onResume();
        // En este punto la aplicacion ya cargo.
        // This en un activity ;
        Toast.makeText(this,
                "Aplicacion Iniciada",
                Toast.LENGTH_LONG).show();
        // Toast.LENGTH_SHORT -- menos tiempo;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,
                "Aplicacion Stopeada",
                Toast.LENGTH_LONG).show();

    }
}
