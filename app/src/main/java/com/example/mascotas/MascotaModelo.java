package com.example.mascotas;

public class MascotaModelo {

    private String nombre;
    private int imgMascota;

    public MascotaModelo() {
    }

    public MascotaModelo(String nombre, int imgMascota) {
        this.nombre = nombre;
        this.imgMascota = imgMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImgMascota() {
        return imgMascota;
    }

    public void setImgMascota(int imgMascota) {
        this.imgMascota = imgMascota;
    }
}
