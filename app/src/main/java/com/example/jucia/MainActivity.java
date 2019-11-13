package com.example.jucia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
