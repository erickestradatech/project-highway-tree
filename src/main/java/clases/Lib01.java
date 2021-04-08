package clases;

import java.text.SimpleDateFormat;
import java.util.*;

public class Lib01 {

    static SimpleDateFormat fg = new SimpleDateFormat("yyyy-MM-dd");

    public static String hoy() {

        Date t = new Date(); // Fecha y hora del sistema operativo

        SimpleDateFormat ds = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy");

        return ds.format(t);
    }

    // Pasando una fecha como cadena que muestre el dia de la semana
    public static String cDia(String cad) {
        // Convertir la cadena fecha
        try {
            Date t = fg.parse(cad);
            SimpleDateFormat ds = new SimpleDateFormat("EEEE");

            return ds.format(t);

        } catch (Exception ex) {

            return "error: " + ex.getMessage();
        }

    }

    // Pasar dos fechas como cadena que retorne los dias entre ambas fechas
    public static long difFecha(String cad1, String cad2) {

        try {

            Date fe1 = fg.parse(cad1);
            Date fe2 = fg.parse(cad2);
            Calendar c1 = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            // Las fechas establecer como calendario para operar
            c1.setTime(fe1);
            c2.setTime(fe2);

            long res = (c2.getTimeInMillis() - c1.getTimeInMillis()) / (1000 * 60 * 60 * 24);
            return res;

        } catch (Exception ex) {

            return 0;
        }

    }

    public static long difFecha(Date fe1, Date fe2) {

        try {

            Calendar c1 = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            // Las fechas establecer como calendario para operar
            c1.setTime(fe1);
            c2.setTime(fe2);

            long res = (c2.getTimeInMillis() - c1.getTimeInMillis()) / (1000 * 60 * 60 * 24);
            return res;

        } catch (Exception ex) {

            return 0;
        }

    }

}
