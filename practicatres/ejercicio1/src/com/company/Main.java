package com.company;

import Excepciones.DatosNoValido;
import Modelo.Mascota;
import Modelo.Veterinario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static ArrayList<Veterinario> vets;
    private static ArrayList<Mascota> listaMascotas;
    public static void main(String[] args) {
        try
        {
            guardarDatos();
        }catch(NullPointerException $e){
            JOptionPane.showMessageDialog(null,"Terminacion");
        }
        catch(Exception $e)
        {
            JOptionPane.showMessageDialog(null, $e.getClass());
        }
    }

    public static void guardarDatos() throws Exception{
        guardarVets();
        crearMascotas();
    }
    public static void guardarVets() throws Exception{
        boolean mas = true;
        vets = new ArrayList<>();
        while(mas)
        {
            vets.add(new Veterinario(solicitarNombre(),solicitarDir(),solicitarTel(),solicitarDni(),solicitarNss()));
            int otraVez = JOptionPane.showConfirmDialog(null,"¿Hay mas veterinarios?");
            if (otraVez == 1)
            {
                mas = false;
            }
        }
    }

    public static String solicitarNombre()
    {
        String nombre="";
        boolean error = true;
        while(error)
        {
            try
            {
                nombre = JOptionPane.showInputDialog("Teclea el nombre");
                if (nombre.isEmpty())
                    throw new DatosNoValido("El nombre es un campo obligatorio");
                Pattern pat = Pattern.compile("^[A-Z][a-z]+([ ][A-Z][a-z]+)*$");
                Matcher mat = pat.matcher(nombre);
                if (!mat.matches())
                    throw new DatosNoValido("El nombre no tiene un formato adecuado");
                error = false;
            }
            catch(DatosNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return nombre;
    }
    public static String solicitarDir()
    {
        String direccion = "";
        boolean error = true;
        while(error)
        {
            try
            {
                direccion = JOptionPane.showInputDialog("Teclea dirección");
                if (direccion.isEmpty())
                    throw new DatosNoValido("La dirección es un campo obligatorio");
                // C/ Portal De Villarreal 19 5A
                Pattern pat = Pattern.compile("^C/ [A-Z][a-z]+([ ][A-Z][a-z]+)* [0-9]{1,3} [0-9][a-zA-Z]$");
                Matcher mat = pat.matcher(direccion);
                if (!mat.matches())
                    throw new DatosNoValido("La dirección no tiene un formato adecuado");
                error = false;
            }
            catch(DatosNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return direccion;


    }
    public static String solicitarTel()
    {
        String telefono="";
        boolean error = true;
        while(error)
        {
            try
            {
                telefono = JOptionPane.showInputDialog("Teclea el telefono");
                if (telefono.isEmpty())
                    throw new DatosNoValido("El telefono es un campo obligatorio");
                Pattern pat = Pattern.compile("^[6789][0-9]{8}$");
                Matcher mat = pat.matcher(telefono);
                if (!mat.matches())
                    throw new DatosNoValido("El teléfono no tiene un formato adecuado");
                error = false;
            }
            catch(DatosNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return telefono;
    }
    public static String solicitarDni()
    {
        String dni="";
        boolean error = true;
        while(error)
        {
            try
            {
                dni = JOptionPane.showInputDialog("Teclea el dni");
                if (dni.isEmpty())
                    throw new DatosNoValido("El dni es un campo obligatorio");
                Pattern pat = Pattern.compile("^[0-9]{8}[A-Za-z]$");
                Matcher mat = pat.matcher(dni);
                if (!mat.matches())
                    throw new DatosNoValido("El dni no tiene un formato adecuado");
                // Array para validar la letra.
                error = false;
            }
            catch(DatosNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return dni;
    }
    public static String solicitarNss()
    {
        String nss="";
        boolean error = true;
        while(error)
        {
            try
            {
                nss = JOptionPane.showInputDialog("Teclea el número de la seguridad social");
                if (nss.isEmpty())
                    throw new DatosNoValido("El número de la seguridad social es un campo obligatorio");
                // https://cursos.com/blog/numero-seguridad-social/#:~:text=El%20N%C3%BAmero%20de%20la%20Seguridad%20Social%20est%C3%A1%20compuesto%20por%20nueve,%C3%BAltimos%20d%C3%ADgitos%20son%20de%20control.
                Pattern pat = Pattern.compile("^01 [0-9]{8} [0-9]{2}$");
                Matcher mat = pat.matcher(nss);
                if (!mat.matches())
                    throw new DatosNoValido("El número de la seguridad social no tiene un formato adecuado");
                error = false;
                // faltan las validaciones de los dígitos de control
            }
            catch(DatosNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return nss;
    }

    public static void crearMascotas() throws Exception{
        boolean mas = true;
        listaMascotas = new ArrayList<>();
        while (mas){
            listaMascotas.add(new Mascota(mascotaRaza(),mascotaNombre(),mascotaNacimiento(),mascotaSexo(),mascotaPeso(),mascotalongitud(),mascotaColor()));
        }
    }

    public static String mascotaRaza() throws DatosNoValido {
        String raza = "";
        boolean error = true;
        while (error)
        {
            raza = JOptionPane.showInputDialog("Teclea la raza de la mascota");
            if (raza.isEmpty())
            {
                throw new DatosNoValido("La raza es un campo obligatorio");
            }
            Pattern pat = Pattern.compile("^[A-Za-z]{1,}+$");
            Matcher mat = pat.matcher(raza);
            if (!mat.matches()){
                throw new DatosNoValido("El formato del campo raza no es adecuado");
            }
            error = false;
        }
        return raza;
    }

    public static String mascotaNombre() throws DatosNoValido {
        String nombre = "";
        boolean error = true;
        while (error){
            nombre = JOptionPane.showInputDialog("Teclea el nombre de la mascota");
            if (nombre.isEmpty())
            {
                throw new DatosNoValido("Nombre de la mascota es obligatorio");
            }
            Pattern pat = Pattern.compile("^[A-Za-z]{3,}+ [ ][A-Za-z]{3,}+$");
            Matcher mat = pat.matcher(nombre);
            if (!mat.matches()){
                throw new DatosNoValido("el formato del campo nombre de mascota no es adecuado");
            }
            error = false;
        }
        return nombre;
    }

    public static String mascotaNacimiento() throws Exception{
        String nacimiento = "";
        boolean error = true;
        while (error){
            nacimiento = JOptionPane.showInputDialog("Teclea el nacimiento de la mascota");
            if (nacimiento.isEmpty())
            {
                throw new DatosNoValido("Nacimiento de la mascota es obligatorio");
            }
            Pattern pat = Pattern.compile("^[0-9]{2}/[0-9]{1,2}/[0-9]{2,4}$");
            Matcher mat = pat.matcher(nacimiento);
            if (!mat.matches()){
                throw new DatosNoValido("el formato del campo nacimiento de mascota no es adecuado");
            }
            error = false;
        }
        return nacimiento;
    }

    public static String mascotaSexo() throws DatosNoValido {
        String sexo = "";
        boolean error = true;
        while (error){
            sexo = JOptionPane.showInputDialog("Teclea el sexo de la mascota");
            if (sexo.isEmpty())
            {
                throw new DatosNoValido("Sexo de la mascota es obligatorio");
            }
            Pattern pat = Pattern.compile("^[A-Za-z]+$");
            Matcher mat = pat.matcher(sexo);
            if (!mat.matches()){
                throw new DatosNoValido("el formato del campo Sexo de mascota no es adecuado");
            }
            error = false;
        }
        return sexo;
    }

    public static float mascotaPeso() throws DatosNoValido {
        boolean error = true;
        float peso = 0.0f;
        while (error) {
            try {
                peso = Float.parseFloat(JOptionPane.showInputDialog("Teclea el peso de la mascota"));
                error = false;
            } catch (NumberFormatException e) {
                throw new DatosNoValido(e.getMessage());
            }
        }
        return peso;
    }

    public static float mascotalongitud() throws DatosNoValido {
        float longitud = 0.0f;
        boolean error = true;
        while (error){
        try {
            longitud = Float.parseFloat(JOptionPane.showInputDialog("Teclea el longitud de la mascota"));
            error = false;
        } catch (NumberFormatException e) {
            throw new DatosNoValido(e.getMessage());
        }
    }
        return longitud;
    }
    
    public static String mascotaColor() throws Exception {
        String color = "";
        boolean error = true;
        while(error) {
            color = JOptionPane.showInputDialog("Tecla el color de la mascota");
            if (color.isEmpty()){
                throw new Exception("Color de mascota es un campo obligatorio");
            }
            Pattern pat = Pattern.compile("^[A-Za-z]{4,}$");
            Matcher mat = pat.matcher(color);
            if (!mat.matches()){
                throw new DatosNoValido("Formato del color de la mascota no es adrcuado");
            }
            error = false;
        }
        return color;
    }

}
