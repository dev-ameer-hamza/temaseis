package com.company;
import Modelo.*;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author 1gdaw06
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Estudio> estudios = new ArrayList<Estudio>();
        ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();

        Estudio primero = new Estudio("FOX","Nueva York","Brooklyn Avenue 12D","www.foxtv.com","17/08/1996","USA","+1456987236");
        Estudio segundo = new Estudio("HBox","Madrid","Avenida Santiago","www.hbox.com","12/01/1995","Spain","+3456987236");
        Estudio tercero = new Estudio("Netflix Studios","Berlin","place unknown","www.netflix.com","12/01/1990","Germany","+3656987236");

        estudios.add(primero);
        estudios.add(tercero);

        Pelicula p = new Pelicula("Marvels",2002,140,"Sci-Fi",estudios);
        Pelicula peli = new Pelicula("The Dawn",2010,160,"Horror",estudios);
        listaPeliculas.add(p);
        listaPeliculas.add(peli);
        if (peli.getDuracion() > p.getDuracion())
        {
            System.out.println(peli.getTitulo() + " tiene duarcion de " + peli.getDuracion() + " minutos");
        }
        else
        {
            System.out.println(p.getTitulo() + " tiene duarcion de " + p.getDuracion() + " minutos");
        }
        for (int i=0;i<p.getEstudios().size();i++){
            System.out.println(p.getEstudios().get(i).getNombre());
        }

        buscarEstudios(listaPeliculas,estudios);

    }

    public static void buscarEstudios(ArrayList<Pelicula> listaPeliculas,ArrayList<Estudio> estudios)
    {
        ArrayList<Integer> occurencia;
        ArrayList<String> estu = new ArrayList<String>();
        for (int objeto=0;objeto < listaPeliculas.size();objeto++)
        {
            for (int es=0;es < listaPeliculas.get(objeto).getEstudios().size();es++)
            {
                String nombre = listaPeliculas.get(objeto).getEstudios().get(es).getNombre();
                if (existsEst(nombre,estu))
                {
                    
                }
                else
                {

                }
            }
        }
    }

    public static boolean existsEst(String nombre,ArrayList<String> estu){
        for (int i=0;i < estu.size();i++)
        {
            if (estu.get(i).equalsIgnoreCase(nombre)){
                return true;
            }
            else{return false;}
        }
    }
}
