package Modelo;

import javax.swing.*;
import java.util.ArrayList;

public class Director extends Empleado{
    private String category;
    private ArrayList<Empleado> subordinados;

    public Director(String nombre,int edad,int sueldo,String category)
    {
        super(nombre,edad,sueldo);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }

    @Override
    public void mostrar()
    {
        JOptionPane.showMessageDialog(null,"Empleado " + this.getNombre() + "de categoria " + this.getCategory() + " ha transcurrido " + this.getEdad() + " y tiene " + this.getSueldoBruto() + " salario");
    }
}
