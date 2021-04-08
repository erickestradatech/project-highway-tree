package clases;

import java.text.DecimalFormat;

public abstract class Proyecto {

    // UTI = $1200
    private String codigo;
    private String nombre;
    private String ubicacion;
    private String fin;
    private String fent;

    static int cuenta = 1;

    public Proyecto(String nombre, String ubicacion, String fin, String fent) {

        DecimalFormat sd = new DecimalFormat("00000");
        this.codigo = sd.format(cuenta++);
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fin = fin;
        this.fent = fent;
    }

    public abstract double costo();

    public abstract double penalidad();

    public abstract double totalPagar();

    public long dias() {

        return Lib01.difFecha(fin, fent);
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getFent() {
        return fent;
    }

    public void setFent(String fent) {
        this.fent = fent;
    }

}
