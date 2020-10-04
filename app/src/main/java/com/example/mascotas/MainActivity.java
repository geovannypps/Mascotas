package com.example.mascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewMascota;
    private RecyclerViewAdaptador adaptadorMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        recyclerViewMascota = (RecyclerView) findViewById(R.id.rvMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(this));

        adaptadorMascota = new RecyclerViewAdaptador(obtenerMascota());
        recyclerViewMascota.setAdapter(adaptadorMascota);
    }

    public List<MascotaModelo> obtenerMascota(){
        List<MascotaModelo> mascota = new ArrayList<>();
        mascota.add(new MascotaModelo("Goofy",R.drawable.perro1));
        mascota.add(new MascotaModelo("Mika",R.drawable.perro2));
        mascota.add(new MascotaModelo("Horus",R.drawable.perro3));
        mascota.add(new MascotaModelo("Peluche",R.drawable.perro4));
        mascota.add(new MascotaModelo("Lala",R.drawable.perro5));

        return mascota;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_favorite:
                Intent siguiente = new Intent(this, MejoresMascotas.class);
                startActivity(siguiente);
            case R.id.action_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}