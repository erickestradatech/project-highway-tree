package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arreglo_Proyecto {

    private ArrayList<Proyecto> lista;

    public Arreglo_Proyecto() {

        lista = new ArrayList();

        lista.add(new Carreteras("Alberto", "Norte", "2020-11-16", "2020-11-30", 1));
        lista.add(new Carreteras("Fiorela", "Sur", "06-05-2019", "07-06-2019", 5));
        lista.add(new Arboles("Juana", "Central", "18-04-2019", "19-04-2019", 120000));
        lista.add(new Carreteras("Patricia", "Sur", "01-01-2020", "02-02-2020", 3));
        lista.add(new Arboles("Alfred", "Norte", "09-11-2020", "30-12-2020", 850000));
        lista.add(new Carreteras("Alexander", "Central", "07-03-2018", "16-04-2018", 9));
    }

    public void adi_Carreteras(Carreteras c) {

        lista.add(c);
    }

    public void adi_Servicios(Arboles a) {

        lista.add(a);
    }

    public ArrayList<Proyecto> listado() {

        return lista;
    }

    public void borra(Proyecto per) {

        lista.remove(per);
    }

    public Proyecto busca(String nro) {

        for (Proyecto x : lista) {

            if (x.getCodigo().equals(nro)) {

                return x;
            }

        }
        return null;
    }

    // ORDENAR POR NOMBRE
    public void ordenNombre() {

        Collections.sort(lista, new orden1());
    }

    //  ORDENAR DE COSTO DE FORMA DESCENDENTE
    public void ordenCosto() {

        Collections.sort(lista, new orden2());
    }

    // CLASE PARA ORDENAR NOMBRES
    class orden1 implements Comparator<Proyecto> {

        @Override
        public int compare(Proyecto p1, Proyecto p2) {

            return p1.getNombre().compareTo(p2.getNombre());
        }

    }

    // CLASE PARA ODERNAR LOS COSTOS
    class orden2 implements Comparator<Proyecto> {

        @Override
        public int compare(Proyecto p1, Proyecto p2) {

            int sw;

            if (p1.costo() > p2.costo()) {

                sw = 1;
            } else if (p1.costo() < p2.costo()) {

                sw = -1;
            } else {

                sw = 0;
            }

            return sw;

        }

    }

}
