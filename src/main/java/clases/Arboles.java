package clases;

public class Arboles extends Proyecto {

    private int canArboles;

    public Arboles(String nombre, String ubicacion, String fin, String fent, int canArboles) {
        super(nombre, ubicacion, fin, fent);
        this.canArboles = canArboles;
    }

    @Override
    public double costo() {

        if (super.getUbicacion().equals("Norte")) {

            return canArboles / 12 * 500;

        } else if (super.getUbicacion().equals("Sur")) {

            return canArboles / 12 * 380;
        } else {

            return canArboles / 12 * 380;
        }

    }

    @Override
    public double penalidad() {

        return super.dias() * 240;
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

    public int getCanArboles() {
        return canArboles;
    }

    public void setCanArboles(int canArboles) {
        this.canArboles = canArboles;
    }

}
