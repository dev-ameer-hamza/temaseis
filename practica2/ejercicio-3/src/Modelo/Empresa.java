package Modelo;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Cliente> clientes = null;
    private ArrayList<Empleado> empleados = null;

    public Empresa(String nombre,ArrayList<Cliente> clientes,ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
