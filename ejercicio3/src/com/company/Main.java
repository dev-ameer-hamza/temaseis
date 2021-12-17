package com.company;
import Modelo.Persona;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.zip.DataFormatException;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        try {
        do {
            pedirInformacion(personas);
        }while(JOptionPane.showConfirmDialog(null,"¿Quieres continuar?") == 0);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    int menu = showMenu();
    operaciones(personas,menu);
    }

    public static void pedirInformacion(ArrayList<Persona> personas) {
        try {
            String nombre = JOptionPane.showInputDialog("Teclea el nombre de la persona");
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia del nacimiento"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes del nacimiento"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Teclea el ano del nacimiento"));
            String dir = JOptionPane.showInputDialog("Teclea la direccion de esta persona");
            String postal = JOptionPane.showInputDialog("Teclea el codigo postal");
            String ciudad = JOptionPane.showInputDialog("Teclea la ciudad");

            Persona p = new Persona(nombre,dia,mes,ano,dir,postal,ciudad);

            personas.add(p);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static int showMenu(){
        String menu = "1) Nombre de persona con mayor edad\n" + "2) Personas con domicilio Elche\n" + "3) Personas mayores de edad";
        int sel = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return sel;
    }

    public static void operaciones(ArrayList<Persona> personas,int menu){
        switch (menu){
            case 1:
                deMayorEdad(personas);
                break;
            case 2:
                viveEnElche(personas);
                break;
            case 3:
                mayoresDeEdad(personas);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion invalido");
        }
    }

    public static void deMayorEdad(ArrayList<Persona> personas){
        try {
            Persona mayor = personas.get(0);
            int edad = 0;
            LocalDate ahora = LocalDate.now();
            for (int x=0;x< personas.size();x++)
            {
                int dia = personas.get(x).getDiaNacimiento();
                int mes = personas.get(x).getMesNacimiento();
                int ano = personas.get(x).getAnoNacimiento();

                LocalDate nacimiento = LocalDate.of(ano,mes,dia);
                if (ahora.isBefore(nacimiento)){
                    JOptionPane.showMessageDialog(null,"Fecha tecleado por esta persona no es valida");
                }
                else
                {
                    Period p = Period.between(nacimiento,ahora);
                    if (p.getYears() > edad){
                        edad = p.getYears();
                        mayor = personas.get(x);
                    }
                }

            }

            JOptionPane.showMessageDialog(null,"Persona con mayor edad es " + mayor.getNombre());

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }

    public static void viveEnElche(ArrayList<Persona> personas){
        ArrayList<Persona> vecinosDeElche = new ArrayList<Persona>();

        for (int x=0;x< personas.size();x++){
            if (personas.get(x).getCiudad().equalsIgnoreCase("Elche")){
                vecinosDeElche.add(personas.get(x));
            }
        }

        showVecinosDeElche(vecinosDeElche);
    }

    public static void mayoresDeEdad(ArrayList<Persona> personas){}

    public static void showVecinosDeElche(ArrayList<Persona> vecinosDeElche){
        String vecinos = "En Elche viven \n";
        if (vecinosDeElche.size() <= 0){
            JOptionPane.showMessageDialog(null,"NO hay ninguna persona que vive en Elche");
        }
        else
        {
            for (int x=0;x<vecinosDeElche.size();x++){
                vecinos += vecinosDeElche.get(x).getNombre() + "\n";
            }
        }

        JOptionPane.showMessageDialog(null,vecinos);
    }
}
