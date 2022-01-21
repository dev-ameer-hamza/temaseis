package Modelo;

public class Mascota {
    private String raza;
    private String nombre;
    private String nacimiento;
    private String sexo;
    private float peso;
    private float longitud;
    private String color;

    private Persona dueño;
    private Veterinario vet;

    public Mascota(String raza, String nombre, String nacimiento, String sexo, float peso, float longitud, String color, Persona dueño, Veterinario vet) {
        this.raza = raza;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.longitud = longitud;
        this.color = color;
        this.dueño = dueño;
        this.vet = vet;
    }

    public Mascota()
    {}

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }
}
