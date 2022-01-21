package Modelo;

public class Perro extends Mascota {
    public Perro(String raza, String nombre, String nacimiento, String sexo, float peso, float longitud, String color, Persona dueño, Veterinario vet) {
        super(raza, nombre, nacimiento, sexo, peso, longitud, color, dueño, vet);
    }
}
