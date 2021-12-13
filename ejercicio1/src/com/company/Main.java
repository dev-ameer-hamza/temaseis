package com.company;
import Calculacion.Circulo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Teclea la longitud del radio"));

        Circulo c1 = new Circulo(radio);

        JOptionPane.showMessageDialog(null,"Circunferencia es " + c1.circunferencia() + "\n");
        JOptionPane.showMessageDialog(null,"Area es " + c1.area() + "\n");
        JOptionPane.showMessageDialog(null,"Volumen es " + c1.volume() + "\n");
    }
}
