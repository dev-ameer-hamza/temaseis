package Modelo;

import javax.swing.*;

public class Cliente extends Persona{
    private String telefono;

    public Cliente(String nombre,int edad,String tel)
    {
        super(nombre,edad);
        this.telefono = tel;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void mostrar()
    {
        JOptionPane.showMessageDialog(null,"Cliente " + this.getNombre() + " ha transcurrido " + this.getEdad() + " y su telefono es " + this.getTelefono());
    }
}
