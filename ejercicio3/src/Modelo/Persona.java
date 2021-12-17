package Modelo;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anoNacimiento;
    private String dirreccion;
    private String codigoPostal;
    private String ciudad;

    public Persona(String nombre,int diaNacimiento, int mesNacimiento, int anoNacimiento, String dirreccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.dirreccion = dirreccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public Persona()
    {

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override

    public String toString(){
        return "Persona";
    }

   /* public LocalDate calcularEdad(String edad)
    {

    }*/
}
