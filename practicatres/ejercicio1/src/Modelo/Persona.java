package Modelo;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String direccion;
    private String tel;

    private ArrayList<Mascota> mascotas;

    public Persona(String nombre, String direccion, String tel) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tel = tel;
        this.mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
