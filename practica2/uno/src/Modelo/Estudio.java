package Modelo;
/**
 * @author 1gdaw06
 */
public class Estudio {
    private String nombre;
    private String ciudad;
    private String direccion;
    private String web;
    private String fechaFun;
    private String pais;
    private String tel;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getFechaFun() {
        return fechaFun;
    }

    public void setFechaFun(String fechaFun) {
        this.fechaFun = fechaFun;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Estudio(String nombre, String ciudad, String direccion, String web, String fechaFun, String pais, String tel) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.web = web;
        this.fechaFun = fechaFun;
        this.pais = pais;
        this.tel = tel;
    }

    public Estudio() {

    }

}
