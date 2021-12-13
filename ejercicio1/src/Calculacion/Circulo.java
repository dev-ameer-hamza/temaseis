package Calculacion;

public class Circulo {
    private double radio;
    private double PAI = Math.PI;
    public Circulo(double radio) {
        this.radio = radio;
        System.out.println("Hola clase");
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double circunferencia()
    {
        return 2*PAI*this.radio;
    }

    public double area()
    {
        return PAI * (this.radio * this.radio);
    }

    public double volume()
    {
        return (4*PAI*(this.radio*this.radio*this.radio)) / 3;
    }
}


