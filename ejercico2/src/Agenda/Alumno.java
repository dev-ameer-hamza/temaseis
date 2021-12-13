package Agenda;

public class Alumno {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String tel;

    public Alumno() {
        System.out.println("Hola mundo");
    }

    public Alumno(String codigo, String nombre, String domicilio, String tel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.tel = tel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


}
