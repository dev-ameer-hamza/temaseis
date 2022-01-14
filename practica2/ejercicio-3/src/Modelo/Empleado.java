package Modelo;

import javax.swing.*;

public class Empleado extends Persona {
    private float sueldoBruto;

    public Empleado(String nombre,int edad,int sueldo)
    {
        super(nombre,edad);
        this.sueldoBruto = sueldo;
    }

    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void calcularSalario()
    {

    }

    @Override
    public void mostrar()
    {
        JOptionPane.showMessageDialog(null,"Empleado " + this.getNombre() + " ha transcurrido " + this.getEdad() + " y tiene " + this.getSueldoBruto() + " salario");
    }
}
