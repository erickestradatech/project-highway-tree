package clases;

public class Carreteras extends Proyecto {

    private double cantidadK;

    public Carreteras(String nombre, String ubicacion, String fin, String fent, double cantidadK) {
        super(nombre, ubicacion, fin, fent);
        this.cantidadK = cantidadK;
    }

    @Override
    public double costo() {

        if (super.getUbicacion().equals("Norte")) {

            return cantidadK * 10000;

        } else if (super.getUbicacion().equals("Centro")) {

            return cantidadK * 8700;

        } else {

            return cantidadK * 9200;
        }

    }

    @Override
    public double penalidad() {

        return (int) super.dias() / 7 * 580;
    }

    @Override
    public double totalPagar() {

        double totalPagar = costo() - penalidad();

        if (totalPagar < 0) {

            return 0;
        } else {

            return totalPagar;
        }

    }

    public double getCantidadK() {
        return cantidadK;
    }

    public void setCantidadK(double cantidadK) {
        this.cantidadK = cantidadK;
    }

}
