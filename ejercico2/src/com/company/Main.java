package com.company;
import Agenda.Alumno;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        int continuar;
        do {

        rellenarAlumnos(alumnos);

        continuar = JOptionPane.showConfirmDialog(null,"¿Hay mas alumnos?");
        }while (continuar == 0);
        buscarAlumno(alumnos);
    }

    public static void rellenarAlumnos(ArrayList<Alumno> alumnos)
    {
        try {

                String codigo = JOptionPane.showInputDialog("Teclea el numero de codigo");
                String nombre = JOptionPane.showInputDialog("Teclea el nombre del alumno");
                String domicilio = JOptionPane.showInputDialog("Teclea el domicilio del alumno");
                String tel = JOptionPane.showInputDialog("Teclea el numero de telefono");

                Alumno a1 = new Alumno(codigo,nombre,domicilio,tel);
                alumnos.add(a1);
                System.out.println("Datos de alumno añadido");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void buscarAlumno(ArrayList<Alumno> alumnos)
    {
        try{
            String codigo = JOptionPane.showInputDialog("Teclea el codigo que quiere buscar");
            int x;
            for(x=0;x< alumnos.size() && !alumnos.get(x).getCodigo().equals(codigo);x++){}
            if (x == alumnos.size())
            {
                JOptionPane.showMessageDialog(null,"Alumno no encontrado");
            }
            else
            {
                JOptionPane.showMessageDialog(null,alumnos.get(x));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


