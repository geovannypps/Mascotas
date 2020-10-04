package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MejoresMascotas extends AppCompatActivity {
    private RecyclerView recyclerViewMascota;
    private RecyclerViewAdaptador adaptadorMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*Recycler views*/
        recyclerViewMascota = (RecyclerView) findViewById(R.id.rvMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(this));

        adaptadorMascota = new RecyclerViewAdaptador(obtenerMascota());
        recyclerViewMascota.setAdapter(adaptadorMascota);
    }

    public List<MascotaModelo> obtenerMascota() {
        List<MascotaModelo> mascota = new ArrayList<>();
        mascota.add(new MascotaModelo("Goofy", R.drawable.perro5));
        mascota.add(new MascotaModelo("Mika", R.drawable.perro3));
        mascota.add(new MascotaModelo("Horus", R.drawable.perro4));
        mascota.add(new MascotaModelo("Peluche", R.drawable.perro2));
        mascota.add(new MascotaModelo("Lala", R.drawable.perro1));

        return mascota;
    }

}
