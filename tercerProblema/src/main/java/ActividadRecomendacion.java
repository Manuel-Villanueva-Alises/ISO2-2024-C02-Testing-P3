public class ActividadRecomendacion {

    public static String recomendarActividad(boolean estadoSalud, float temperatura, int humedad,
                                             boolean precipitaciones, boolean nublado,
                                             boolean aforoPermitido, boolean restriccionesLocales) {
        // Validar estado de salud
        if (!estadoSalud) {
            return "No puede realizar ninguna actividad";
        }

        // Condiciones para recomendar actividades
        if (temperatura < 0 && humedad < 15 && precipitaciones) {
            return "Quédate en casa";
        }
        if (temperatura < 0 && humedad < 15 && !precipitaciones && aforoPermitido) {
            return "Ir a esquiar";
        }
        if (temperatura >= 0 && temperatura < 15 && !precipitaciones && aforoPermitido) {
            return "Hacer senderismo";
        }
        if (temperatura >= 15 && temperatura < 25 && !precipitaciones && !nublado 
            && humedad <= 60 && !restriccionesLocales) {
            return "Hacer turismo al aire libre.";
        }
        if (temperatura >= 25 && temperatura <= 35 && !precipitaciones && aforoPermitido) {
            return "Ir de cañas";
        }
        if (temperatura > 30 && !precipitaciones && aforoPermitido) {
            return "Ir a la playa o piscina.";
        }

        // Por defecto
        if (true) { // Se usa if true para mantener la estructura "solo if"
            return "Quédate en casa";
        }
        
        return ""; // Esto es redundante pero se incluye para evitar advertencias de compilación.
    }

    public static void main(String[] args) {
        // Ejemplo de prueba
        boolean estadoSalud = true;
        float temperatura = 20.0f;
        int humedad = 50;
        boolean precipitaciones = false;
        boolean nublado = false;
        boolean aforoPermitido = true;
        boolean restriccionesLocales = false;

        String actividadRecomendada = recomendarActividad(
            estadoSalud, temperatura, humedad, precipitaciones, nublado, aforoPermitido, restriccionesLocales
        );

        System.out.println("Recomendación: " + actividadRecomendada);
    }
}