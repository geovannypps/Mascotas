package com.example.mascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mascota;
        ImageView imgMascota;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            imgMascota = (ImageView) itemView.findViewById(R.id.ivFotoMascota);
        }
    }

    public List<MascotaModelo> mascotaLista;

    public RecyclerViewAdaptador(List<MascotaModelo> mascotaLista) {
        this.mascotaLista = mascotaLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mascota.setText(mascotaLista.get(position).getNombre());
        holder.imgMascota.setImageResource(mascotaLista.get(position).getImgMascota());
    }

    @Override
    public int getItemCount() {
        return mascotaLista.size();
    }
}
