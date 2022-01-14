package com.company;

import Modelo.Cliente;
import Modelo.Director;
import Modelo.Empleado;
import Modelo.Empresa;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Empleado> primerTurno = new ArrayList<Empleado>();
    public static ArrayList<Empleado> segundoTurno = new ArrayList<Empleado>();
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static void main(String[] args) {
        crearClientes();
        crearEmpleados();
        Director d1 = new Director("Nieves",56,2650,"tutor");
        d1.setSubordinados(primerTurno);
        Director d2 = new Director("Blanca",54,2450,"Docente");
        d2.setSubordinados(segundoTurno);
        mostrarSubordinados(d1);
        mostrarSubordinados(d2);

        Empresa emp1 = new Empresa("Egibide",clientes,primerTurno);
        mostarClientesDeEmpresa(emp1);


    }

    public static void crearEmpleados() {
        Empleado em1 = new Empleado("Arritz",45,1700);
        Empleado em2 = new Empleado("Adrian",22,1750);
        Empleado em3 = new Empleado("Gaizka",34,1600);

        primerTurno.add(em1);
        primerTurno.add(em2);
        primerTurno.add(em3);

        Empleado en1 = new Empleado("Iñaki",100,4700);
        Empleado en2 = new Empleado("Gorka",12,175);
        Empleado en3 = new Empleado("Sergio",74,1600);

        segundoTurno.add(en1);
        segundoTurno.add(en2);
        segundoTurno.add(en3);
    }
    public static void crearClientes() {

        clientes.add(new Cliente("Ameer",24,"34256789569"));
        clientes.add(new Cliente("Azib",25,"3425129569"));
        clientes.add(new Cliente("Ali",21,"3484466669"));
        clientes.add(new Cliente("Ahmed",20,"3925963546"));

        clientes.add(new Cliente("Gutavo",24,"34256789569"));
        clientes.add(new Cliente("Akbal",25,"3425129569"));
        clientes.add(new Cliente("Alejandro",21,"3484466669"));
        clientes.add(new Cliente("Soren",20,"3925963546"));

    }
    public static void mostrarSubordinados(Director d) {
        for(int i=0;i <d.getSubordinados().size();i++ )
        {
            System.out.println("Director es " + d.getNombre() + "\n");
            System.out.println(d.getSubordinados().get(i).getNombre() + "\n");
        }
    }
    public static void mostarClientesDeEmpresa(Empresa emp){
        System.out.println("=============================================");
        for (int i=0;i < emp.getClientes().size();i++){
            System.out.println("el cliente de empresa " + emp.getNombre() + " es " + emp.getClientes().get(i).getNombre() + "\n");
        }
    }
}
